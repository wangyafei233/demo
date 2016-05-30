//package demo.ax.snmp;
//
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.net.UnknownHostException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Vector;
//
//import org.snmp4j.CommandResponder;
//import org.snmp4j.CommandResponderEvent;
//import org.snmp4j.CommunityTarget;
//import org.snmp4j.MessageDispatcherImpl;
//import org.snmp4j.PDU;
//import org.snmp4j.Snmp;
//import org.snmp4j.TransportMapping;
//import org.snmp4j.event.ResponseEvent;
//import org.snmp4j.mp.MPv1;
//import org.snmp4j.mp.MPv2c;
//import org.snmp4j.mp.MPv3;
//import org.snmp4j.mp.SnmpConstants;
//import org.snmp4j.security.SecurityModels;
//import org.snmp4j.security.SecurityProtocols;
//import org.snmp4j.security.USM;
//import org.snmp4j.smi.Address;
//import org.snmp4j.smi.GenericAddress;
//import org.snmp4j.smi.OID;
//import org.snmp4j.smi.OctetString;
//import org.snmp4j.smi.TcpAddress;
//import org.snmp4j.smi.UdpAddress;
//import org.snmp4j.smi.VariableBinding;
//import org.snmp4j.transport.DefaultTcpTransportMapping;
//import org.snmp4j.transport.DefaultUdpTransportMapping;
//import org.snmp4j.util.MultiThreadedMessageDispatcher;
//import org.snmp4j.util.ThreadPool;
//
//
//public class SnmpDAO implements CommandResponder {
//	private Snmp snmp = null;
//	private Address targetAddress = null;
//	
//	private MultiThreadedMessageDispatcher dispatcher;  
//	private ThreadPool threadPool; 
//
//	/***
//	 * 连接测试
//	 * @param ip
//	 */
//	public boolean connTest(String ip) {
//		boolean testResult=true;
//		try {
//			targetAddress = GenericAddress.parse("udp:" + ip + "/161");
//			TransportMapping transport = new DefaultUdpTransportMapping();
//			snmp = new Snmp(transport);
//			transport.listen();
//			CommunityTarget target = new CommunityTarget();
//			target.setCommunity(new OctetString("public"));
//			target.setAddress(targetAddress);
//			// 通信不成功时的重传次数
//			target.setRetries(2);
//			// 超时时间（ 单位：milliseconds ）
//			target.setTimeout(1500);
//			// 设置或者获取版本号（支持V1，V2c，V3）
//			target.setVersion(SnmpConstants.version2c);
//			// 创建 PDU
//			PDU pdu = new PDU();
//			pdu.add(new VariableBinding(new OID("0.0")));
//			// MIB的访问方式
//			pdu.setType(PDU.GETNEXT);
//			ResponseEvent respEvnt = snmp.send(pdu, target);
//			// 解析Response
//			if (respEvnt != null && respEvnt.getResponse() != null) {
//			}else {
//				testResult=false;
//				System.out.println("不支持SNMP协议或超时");
//			}
//		} catch (Exception e) {
//			testResult=false;
//			System.out.println("不支持SNMP协议或超时");
//		}
//		return testResult;
//
//	}
//	/***
//	 * 连接代理并监听
//	 * @param ip
//	 */
//	public void initComm(String ip) {
//		try {
//			// 设置Agent方的IP和端口
//			targetAddress = GenericAddress.parse("udp:" + ip + "/161");
//			// 使用UDP传输协议
//			TransportMapping transport = new DefaultUdpTransportMapping();
//			// 使用TCP传输协议
//			// ransportMapping transport = new DefaultTcpTransportMapping();
//
//			// USM usm = new USM(SecurityProtocols.getInstance(), new
//			// OctetString(
//			// MPv3.createLocalEngineID()), 0);
//			//
//			// SecurityModels.getInstance().addSecurityModel(usm);
//
//			snmp = new Snmp(transport);
//			transport.listen();
//		} catch (Exception e) {
//			System.out.println("不支持SNMP协议或超时");
//		}
//
//	}
//	/***
//	 * 发送请求
//	 * @param reqOid
//	 */
//	public String[] sendPDU(String reqOid) {
//		// add user to the USM
//		// snmp.getUSM().addUser(
//		// new OctetString("MD5DES"),
//		// new UsmUser(new OctetString("MD5DES"), AuthMD5.ID,
//		// new OctetString("MD5DESUserAuthPassword"), PrivDES.ID,
//		// new OctetString("MD5DESUserPrivPassword")));
//
//		// 设置 target
//		CommunityTarget target = new CommunityTarget();
//		target.setCommunity(new OctetString("public"));
//		// 设置ip地址
//		target.setAddress(targetAddress);
//		// 通信不成功时的重传次数
//		target.setRetries(2);
//		// 超时时间（ 单位：milliseconds ）
//		target.setTimeout(1500);
//		// 设置或者获取版本号（支持V1，V2c，V3）
//		target.setVersion(SnmpConstants.version2c);
//		// 最大PDU大小值
//		// target.setMaxSizeRequestPDU(10);
//
//		// /**
//		// * 使用其子类UserTarget，增加了一些有关USM安全方面的设置，比如采用的安全模型、
//		// * 安全级别、访问该设备的用户名以及权威引擎ID（authoritative engine ID）
//		// */
//		// UserTarget userTarget = new UserTarget();
//		// userTarget.setAddress(targetAddress);
//		// userTarget.setRetries(1);
//		// userTarget.setTimeout(5000);
//		// userTarget.setVersion(SnmpConstants.version3);
//		// // 安全级别（支持三种安全级别）
//		// userTarget.setSecurityLevel(SecurityLevel.AUTH_PRIV);
//		// // 访问用户名（该访问用户名称必须在设置USM的时候添加其相应的UsmUser）
//		// userTarget.setSecurityName(new OctetString("MD5DES"));
//
//		// 创建 PDU
//		PDU pdu = new PDU();
//		pdu.add(new VariableBinding(new OID(reqOid)));
//		// MIB的访问方式
//		pdu.setType(PDU.GETNEXT);
//
//		// 向Agent发送PDU，并接收Response
//		String[] outinfo = new String[] { "", "" };
//		try {
//			ResponseEvent respEvnt = snmp.send(pdu, target);
//			// extract the response PDU (could be null if timed out)
//			// PDU responsePDU = respEvnt.getResponse();
//			// extract the address used by the agent to send the response:
//			// Address peerAddress = respEvnt.getPeerAddress();
//
//			// 解析Response
//			if (respEvnt != null && respEvnt.getResponse() != null) {
//				Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()
//						.getVariableBindings();
//				if (recVBs.size() > 0) {
//					VariableBinding recVB = recVBs.elementAt(0);
//					System.out.println(recVB.getOid() + " : "
//							+ recVB.getVariable());
//					outinfo[0] = recVB.getOid().toString();
//					outinfo[1] = recVB.getVariable().toString();
//				}
//			}
//		} catch (Exception e) {
//			System.out.println("不支持SNMP协议或超时");
//		}
//
//		return outinfo;
//	}
//
//	public String getAll() {
//
//		// 设置 target
//		CommunityTarget target = new CommunityTarget();
//		target.setCommunity(new OctetString("public"));
//		target.setAddress(targetAddress);
//		// 通信不成功时的重试次数
//		target.setRetries(2);
//		// 超时时间
//		target.setTimeout(1500);
//		target.setVersion(SnmpConstants.version1);
//		// 创建 PDU
//		PDU pdu = new PDU();
//		// MIB的访问方式
//		pdu.setType(PDU.GETNEXT);
//		String stroid = "0.0";
//		String snmpvalue = "";
//		int j = 0;
//		String all = "";
//		System.out.println();
//		int eofmib = 0;
//		try {
//			while (eofmib != 5) {
//				j = j + 1;
//				// System.out.println(j);
//				pdu.clear();
//				pdu.add(new VariableBinding(new OID(stroid)));
//				// 向Agent发送PDU，并接收Response
//				ResponseEvent respEvnt = snmp.send(pdu, target);
//				// 解析Response
//				stroid = "oid:";
//				// mf.textBox.append(all);
//				if (respEvnt != null && respEvnt.getResponse() != null) {
//					Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()
//							.getVariableBindings();
//					if (recVBs.size() > 0) {
//						VariableBinding recVB = recVBs.elementAt(0);
//						// System.out.println(recVB.getOid() + " : " +
//						// recVB.getVariable());
//						stroid = recVB.getOid().toString();
//						snmpvalue = recVB.getVariable().toString();
//						eofmib = recVB.getSyntax();
//						if (eofmib != 5) {
//							all = all + stroid + "\n";
//							all = all + snmpvalue + "\n";
//							System.out.println(all);
//						}
//					}
//				} else {
//					System.out.println("尚未安装snmp协议");
//					all = "尚未安装snmp协议！";
//					return all;
//				}
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return all;
//	}
//
//	public String getSnmpAll(String ip) {
//		String name = ip;
//		String all = "";
//		try {
//			initComm(name);
//			all = getAll();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return all;
//	}
//
//	public String[] getValue(String ip) {
//		String name = ip;
//		String snmpinfo[] = new String[] { "0.0", "" };
//		int ii = 0;
//		String returnValue[] = new String[50];
//		try {
//			do {
//				initComm(name);
//				snmpinfo = sendPDU(snmpinfo[0]);
//				returnValue[ii] = snmpinfo[1];
//				ii = ii + 1;
//			} while (ii < 50);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(returnValue);
//		return returnValue;
//	}
//
//	// stroids要开始读取的OID,oidindex要查询的元素值
//	public List<MibDTO> getPartMIB(String stroids, int oidindex,boolean ifChangeCN) {
//		CommunityTarget target = new CommunityTarget();
//		target.setCommunity(new OctetString("public"));
//		target.setAddress(targetAddress);
//		target.setRetries(2);
//		target.setTimeout(1500);
//		target.setVersion(SnmpConstants.version2c);
//
//		PDU pdu = new PDU();
//		pdu.setType(PDU.GETNEXT);
//
//		String stroid = stroids;
//		int i = 0;
//		Boolean iscomplete = false;
//		List<MibDTO> outmib = new ArrayList<MibDTO>();
//		try {
//			oidindex = oidindex - 1;
//			String[] arrind = stroids.split("\\.");
//			// System.out.println("arrind:"+Arrays.asList(arrind));
//			String strind = arrind[oidindex];
//			// System.out.println("strind:"+strind);
//			while (!iscomplete) {
//
//				pdu.clear();
//				pdu.add(new VariableBinding(new OID(stroid)));
//				ResponseEvent respEvnt = snmp.send(pdu, target);
//				// System.out.println(stroids+"---"+stroid);
//				if (respEvnt != null && respEvnt.getResponse() != null) {
//					Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()
//							.getVariableBindings();
//					if (recVBs.size() > 0) {
//						VariableBinding recVB = recVBs.elementAt(0);
//
//						String[] strtemp = recVB.getOid().toString()
//								.split("\\.");
//						// System.out.println("strtemp:"+Arrays.asList(strtemp));
////						System.out.println("getSyntax:"+recVB.getVariable().getSyntaxString());
//						if ((recVB.getSyntax() != 5)
//								&& (strtemp[oidindex].equals(strind))) {
//							MibDTO mib = new MibDTO();
//							/**判断是否需要中文转换*/
//							
//								if(ifChangeCN){
//									if(recVB.getVariable().getSyntaxString().equals("OCTET STRING")){
//										if (recVB.getVariable().toString().indexOf(":") > -1) {
//											mib.setDesc(exchange(recVB.getVariable().toString()));
//											mib.setOid(recVB.getOid().toString());
////											System.out.println(i+1+">"+exchange(recVB.getVariable().toString()) + "--rr--" + recVB.getOid());			
//										} else {
//											mib.setDesc(recVB.getVariable().toString());
//											mib.setOid(recVB.getOid().toString());
////											System.out.println(i+1+">"+recVB.getVariable()
////													.toString() + "--转中文--" + recVB.getOid());
//										}
//									}
//								}else {
////									System.out.println(i+1+">"+recVB.getVariable()
////											.toString() + "----" + recVB.getOid());
//									mib.setDesc(recVB.getVariable().toString());
//									mib.setOid(recVB.getOid().toString());
//								}
//								
//							outmib.add(mib);
//							i = i + 1;
//							stroid = recVB.getOid().toString();
//						} else {
//							iscomplete = true;
//						}
//					}
//
//				} else {
//					System.out.println(" 连接SNMP协议超时！");
//					iscomplete = true;
//				}
//
//			}
//		} catch (Exception e) {
//			outmib = null;
//		}
////		System.out.println("总计:" + outmib.size());
//		return outmib;
//	}
//	
//	/**
//	 * 读取某一段的OID,根据开始与结束去读取
//	 */
//	public List<MibDTO> getPartMIB1(String stroids,String endoids,boolean ifChangeCN) {
//		CommunityTarget target = new CommunityTarget();
//		target.setCommunity(new OctetString("public"));
//		target.setAddress(targetAddress);
//		target.setRetries(2);
//		target.setTimeout(1500);
//		target.setVersion(SnmpConstants.version2c);
//
//		PDU pdu = new PDU();
//		pdu.setType(PDU.GETNEXT);
//
//		String stroid = stroids;
//		int i = 0;
//		Boolean iscomplete = false;
//		List<MibDTO> outmib = new ArrayList<MibDTO>();
//		try {
//			String[] arrind = stroids.split("\\.");
//			// System.out.println("arrind:"+Arrays.asList(arrind));
//			String strind = endoids;
//			// System.out.println("strind:"+strind);
//			while (!iscomplete) {
//
//				pdu.clear();
//				pdu.add(new VariableBinding(new OID(stroid)));
//				ResponseEvent respEvnt = snmp.send(pdu, target);
//				// System.out.println(stroids+"---"+stroid);
//				if (respEvnt != null && respEvnt.getResponse() != null) {
//					Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()
//							.getVariableBindings();
//					
//					if (recVBs.size() > 0) {
//						VariableBinding recVB = recVBs.elementAt(0);
//
//						String strtemp = recVB.getOid().toString();
//						// System.out.println("strtemp:"+Arrays.asList(strtemp));
////						System.out.println("getSyntax:"+recVB.getSyntax());
//						if ((recVB.getSyntax() != 5)
//								&& !(stroid.equals(strind))) {
//							MibDTO mib = new MibDTO();
//							/**判断是否需要中文转换*/
//							
//							if(ifChangeCN){
//								if (recVB.getVariable().toString().indexOf(":") > -1) {
//									mib.setDesc(exchange(recVB.getVariable().toString()));
//									mib.setOid(recVB.getOid().toString());
////									System.out.println(i+1+">"+exchange(recVB.getVariable().toString()) + "--rr--" + recVB.getOid());			
//								} else {
//									mib.setDesc(recVB.getVariable().toString());
//									mib.setOid(recVB.getOid().toString());
////									System.out.println(i+1+">"+recVB.getVariable()
////											.toString() + "--转中文--" + recVB.getOid());
//								}
//							}else {
////								System.out.println(i+1+">"+recVB.getVariable()
////										.toString() + "----" + recVB.getOid());
//								mib.setDesc(recVB.getVariable().toString());
//								mib.setOid(recVB.getOid().toString());
//							}
//							outmib.add(mib);
//							i = i + 1;
//							stroid = recVB.getOid().toString();
//						} else {
//							iscomplete = true;
//						}
//					}
//
//				} else {
//					System.out.println(" 连接SNMP协议超时！");
//					iscomplete = true;
//				}
//
//			}
//		} catch (Exception e) {
//			outmib = null;
//		}
////		System.out.println("总计:" + outmib.size());
//		return outmib;
//	}
//
//	/**
//	 * 读取某一段的OID,根据开始与结束去读取
//	 */
//	public List<MibDTO> getPartMIB2(String stroids,int endindex,boolean ifChangeCN) {
//		CommunityTarget target = new CommunityTarget();
//		target.setCommunity(new OctetString("public"));
//		target.setAddress(targetAddress);
//		target.setRetries(2);
//		target.setTimeout(1500);
//		target.setVersion(SnmpConstants.version2c);
//
//		PDU pdu = new PDU();
//		pdu.setType(PDU.GETNEXT);
//
//		String stroid = stroids;
//		int i = 0;
//		Boolean iscomplete = false;
//		List<MibDTO> outmib = new ArrayList<MibDTO>();
//		try {
//			while (!iscomplete) {
//
//				pdu.clear();
//				pdu.add(new VariableBinding(new OID(stroid)));
//				ResponseEvent respEvnt = snmp.send(pdu, target);
//				// System.out.println(stroids+"---"+stroid);
//				if (respEvnt != null && respEvnt.getResponse() != null) {
//					Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()
//							.getVariableBindings();
//					
//					if (recVBs.size() > 0) {
//						VariableBinding recVB = recVBs.elementAt(0);
//
//						String strtemp = recVB.getOid().toString();
//						// System.out.println("strtemp:"+Arrays.asList(strtemp));
////						System.out.println("getSyntax:"+recVB.getSyntax());
//						if ((recVB.getSyntax() != 5)
//								&& i>endindex) {
//							MibDTO mib = new MibDTO();
//							/**判断是否需要中文转换*/
//							if(ifChangeCN){
//								if (recVB.getVariable().toString().indexOf(":") > -1) {
//									mib.setDesc(exchange(recVB.getVariable().toString()));
//									mib.setOid(recVB.getOid().toString());
////									System.out.println(i+1+">"+exchange(recVB.getVariable().toString()) + "--rr--" + recVB.getOid());			
//								} else {
//									mib.setDesc(recVB.getVariable().toString());
//									mib.setOid(recVB.getOid().toString());
////									System.out.println(i+1+">"+recVB.getVariable()
////											.toString() + "--转中文--" + recVB.getOid());
//								}
//							}else {
////								System.out.println(i+1+">"+recVB.getVariable()
////										.toString() + "----" + recVB.getOid());
//								mib.setDesc(recVB.getVariable().toString());
//								mib.setOid(recVB.getOid().toString());
//							}
//							outmib.add(mib);
//							i = i + 1;
//							stroid = recVB.getOid().toString();
//						} else {
//							iscomplete = true;
//						}
//					}
//
//				} else {
//					System.out.println(" 连接SNMP协议超时！");
//					iscomplete = true;
//				}
//
//			}
//		} catch (Exception e) {
//			outmib = null;
//		}
////		System.out.println("总计:" + outmib.size());
//		return outmib;
//	}
//	
//	
//	/**
//	 * 中文转换
//	 */
//	public String exchange(String input) {
//		String result;
//		if(input!=""){
//			StringBuffer sb = new StringBuffer();
//			String hexs = input;
//			String[] sa;
//			if(hexs.indexOf(":")>-1){
//				sa = hexs.split(":");
//			}else {
//				sa=null;
//			}
//			if(sa!=null && sa.length>3){
//				for (String s : sa) {
//					char c = (char) (Integer.parseInt(s, 16));
//					sb.append(c);
//				}
//				result = sb.toString();
//				try {
//					result = new String(result.getBytes("ISO-8859-1"), "GBK");
//				} catch (UnsupportedEncodingException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}else {
//				result=input;
//			}
//		}else {
//			result=input;
//		}	
//		return result;
//	}
//	
//	/**
//	 * 安装软件
//	 */
//	public List<MibDTO> getMIBinstall(String ip,String stroids, int oidindex,boolean ifChangeCN) {
//		initComm(ip);
//		List<MibDTO> arrmibho = new ArrayList<MibDTO>();
//		List<MibDTO> mibLists = new ArrayList<MibDTO>();
//		try {
//			arrmibho = getPartMIB(stroids, oidindex,ifChangeCN);
//			if ( arrmibho != null )
//	        {
//	            int each = arrmibho.size(  ) / 5;
//
//	            for ( int i = 0; i < arrmibho.size(  ); i++ )
//	            {
//	                MibDTO mibdtos = new MibDTO(  );
//
//	                if ( ( i >= each ) && ( i < ( each * 2 ) ) )
//	                {
//	                    mibdtos.setDesc(exchange( arrmibho.get( i ).getDesc(  ) ) );
//	                    mibdtos.setOid( arrmibho.get( i ).getOid(  ) );
//
////	                    System.out.println(i+":"+mibdtos.getDesc());
//	                } else
//	                {
//	                    mibdtos.setDesc( arrmibho.get( i ).getDesc(  ) );
//	                    mibdtos.setOid( arrmibho.get( i ).getOid(  ) );
//	                }
//
//	                mibLists.add( mibdtos );
//	            }
//	        }
//		} catch (Exception e) {
//			e.printStackTrace();
//			mibLists=null;
//		}
//		return mibLists;
//	}
//	/**
//	 * 进程
//	 */
//	public List<MibDTO> getMIBproc(String ip,String stroids, int oidindex,boolean ifChangeCN) {
//		initComm(ip);
//		List<MibDTO> arrmibho = new ArrayList<MibDTO>();
//		List<MibDTO> mibLists = new ArrayList<MibDTO>();
//		try {
//			arrmibho = getPartMIB(stroids, oidindex,ifChangeCN);
//			if ( arrmibho != null )
//	        {
//	            int each = arrmibho.size(  ) / 9;
//
//	            for ( int i = 0; i < arrmibho.size(  ); i++ )
//	            {
//	                MibDTO mibdtos = new MibDTO(  );
//
//	                if ( ( i >= each ) && ( i < ( each * 2 ) ) )
//	                {
//	                    mibdtos.setDesc(exchange( arrmibho.get( i ).getDesc(  ) ) );
//	                    mibdtos.setOid( arrmibho.get( i ).getOid(  ) );
//
////	                    System.out.println(i+":"+mibdtos.getDesc());
//	                } else
//	                {
//	                	 if ( ( i >= each*3) && ( i < ( each * 4 ) ) )
//	 	                {
//	 	                    mibdtos.setDesc(exchange( arrmibho.get( i ).getDesc(  ) ) );
//	 	                    mibdtos.setOid( arrmibho.get( i ).getOid(  ) );
//
////	 	                    System.out.println(i+":"+mibdtos.getDesc());
//	 	                } else
//	 	                {
//	 	                    mibdtos.setDesc( arrmibho.get( i ).getDesc(  ) );
//	 	                    mibdtos.setOid( arrmibho.get( i ).getOid(  ) );
//	 	                }
//	                }
//
//	                mibLists.add( mibdtos );
//	            }
//	        }
//		} catch (Exception e) {
//			e.printStackTrace();
//			mibLists=null;
//		}
//		return mibLists;
//	}
//	
//	
//	/**
//	 * 储存
//	 */
//	public List<MibDTO> getMIBstorage(String ip,String stroids, int oidindex,boolean ifChangeCN) {
//		initComm(ip);
//		List<MibDTO> arrmibho = new ArrayList<MibDTO>();
//		List<MibDTO> mibLists = new ArrayList<MibDTO>();
//		try {
//			arrmibho = getPartMIB(stroids, oidindex,ifChangeCN);
//			if ( arrmibho != null )
//	        {
//	            int each = arrmibho.size(  ) / 7;
//
//	            for ( int i = 0; i < arrmibho.size(  ); i++ )
//	            {
//	                MibDTO mibdtos = new MibDTO(  );
//
//	                if ( ( i >= each*2 ) && ( i < ( each * 3 ) ) )
//	                {
//	                    mibdtos.setDesc(exchange( arrmibho.get( i ).getDesc(  ) ) );
//	                    mibdtos.setOid( arrmibho.get( i ).getOid(  ) );
//
//	                    System.out.println(i+":"+mibdtos.getDesc());
//	                } else
//	                {
//	 	                    mibdtos.setDesc( arrmibho.get( i ).getDesc(  ) );
//	 	                    mibdtos.setOid( arrmibho.get( i ).getOid(  ) );
//	                }
//
//	                mibLists.add( mibdtos );
//	            }
//	        }
//		} catch (Exception e) {
//			e.printStackTrace();
//			mibLists=null;
//		}
//		return mibLists;
//	}
//	
//	/**
//	 * 接口
//	 */
//	public List<MibDTO> getMIBinterfaces(String ip,String stroids, int oidindex,boolean ifChangeCN) {
//		initComm(ip);
//		List<MibDTO> arrmibho = new ArrayList<MibDTO>();
//		List<MibDTO> mibLists = new ArrayList<MibDTO>();
//		try {
//			arrmibho = getPartMIB(stroids, oidindex,ifChangeCN);
//			if ( arrmibho != null )
//	        {
//	            int each = arrmibho.size(  ) / 22;
//
//	            for ( int i = 0; i < arrmibho.size(  ); i++ )
//	            {
//	                MibDTO mibdtos = new MibDTO(  );
//
//	                if ( ( i >= each ) && ( i < ( each * 2 ) ) )
//	                {
//	                    mibdtos.setDesc(exchange( arrmibho.get( i ).getDesc(  ) ) );
//	                    mibdtos.setOid( arrmibho.get( i ).getOid(  ) );
//
////	                    System.out.println(i+":"+mibdtos.getDesc());
//	                } else
//	                {
//	                    mibdtos.setDesc( arrmibho.get( i ).getDesc(  ) );
//	                    mibdtos.setOid( arrmibho.get( i ).getOid(  ) );
//	                }
//
//	                mibLists.add( mibdtos );
//	            }
//	        }
//		} catch (Exception e) {
//			e.printStackTrace();
//			mibLists=null;
//		}
//		return mibLists;
//	}
//	
//	
//	
//	
//	/***
//	 * 
//	 * SNMP TRAP
//	 * @throws UnknownHostException
//	 * @throws IOException
//	 * 
//	 */
//	
//	private void init() throws UnknownHostException, IOException {  
//		        threadPool = ThreadPool.create("Trap", 2);  
//		        dispatcher = new MultiThreadedMessageDispatcher(threadPool,  
//		                new MessageDispatcherImpl());  
//		        targetAddress = GenericAddress.parse(System.getProperty(  
//		                "snmp4j.listenAddress", "udp:192.168.1.112/162")); // 本地IP与监听端口  
//		        TransportMapping transport;  
//		        // 对TCP与UDP协议进行处理  
//		        if (targetAddress instanceof UdpAddress) {  
//		            transport = new DefaultUdpTransportMapping(  
//		                    (UdpAddress) targetAddress);  
//		        } else {  
//		            transport = new DefaultTcpTransportMapping(  
//		                    (TcpAddress) targetAddress);  
//		        }  
//		        snmp = new Snmp(dispatcher, transport);  
//		        snmp.getMessageDispatcher().addMessageProcessingModel(new MPv1());  
//		        snmp.getMessageDispatcher().addMessageProcessingModel(new MPv2c());  
//		        snmp.getMessageDispatcher().addMessageProcessingModel(new MPv3());  
//		        USM usm = new USM(SecurityProtocols.getInstance(), new OctetString(MPv3  
//		                .createLocalEngineID()), 0);  
//		        SecurityModels.getInstance().addSecurityModel(usm);  
//		        snmp.listen();  
//		    }  
//		  
//		      
//		    public void run() {  
//		        try {  
//		            init();  
//		            snmp.addCommandResponder(this);
//		            System.out.println("开始监听Trap信息!");  
//		        } catch (Exception ex) {  
//		            ex.printStackTrace();  
//		        }  
//		    }  
//		  
//		    /** 
//		     * 实现CommandResponder的processPdu方法, 用于处理传入的请求、PDU等信息 
//		     * 当接收到trap时，会自动进入这个方法 
//		     *  
//		     * @param respEvnt 
//		     */  
//		    public void processPdu(CommandResponderEvent respEvnt) { 
//		    	System.out.println("监听到了，有家伙");
//		        // 解析Response  
//		        if (respEvnt != null && respEvnt.getPDU() != null) {  
//		            Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getPDU().getVariableBindings();  
//		            for (int i = 0; i < recVBs.size(); i++) {  
//		                VariableBinding recVB = recVBs.elementAt(i);  
//		                System.out.println(recVB.getOid() + " : " + recVB.getVariable());  
//		            }  
//		        }  
//		    }
//		    
//		    public void initComm1() throws IOException {  
//		    	  
//		    	        // 设置管理进程的IP和端口  
//		    	        targetAddress = GenericAddress.parse("udp:192.168.1.112/162");  
//		    	        TransportMapping transport = new DefaultUdpTransportMapping();  
//		    	        snmp = new Snmp(transport);  
//		    	        transport.listen();  
//		    	  
//		    	    }  
//		    	  
//		    	    /** 
//		    	     * 向管理进程发送Trap报文 
//		    	     *  
//		    	     * @throws IOException 
//		    	     */  
//		    	    public void sendPDU1() throws IOException {  
//		    	  
//		    	        // 设置 target  
//		    	        CommunityTarget target = new CommunityTarget();  
//		    	        target.setAddress(targetAddress);  
//		    	  
//		    	        // 通信不成功时的重试次数  
//		    	        target.setRetries(2);  
//		    	        // 超时时间  
//		    	        target.setTimeout(1500);  
//		    	        // snmp版本  
//		    	        target.setVersion(SnmpConstants.version2c);  
//		    	  
//		    	        // 创建 PDU  
//		    	        PDU pdu = new PDU();  
//		    	        pdu.add(new VariableBinding(new OID(".1.3.6.1.2.3377.10.1.1.1.1"),  
//		    	                new OctetString("SnmpTrap")));  
//		    	        pdu.add(new VariableBinding(new OID(".1.3.6.1.2.3377.10.1.1.1.2"),  
//		    	                new OctetString("JavaEE")));  
//		    	        pdu.setType(PDU.TRAP);  
//		    	  
//		    	        // 向Agent发送PDU，并接收Response  
//		    	        ResponseEvent respEvnt = snmp.send(pdu, target);  
//		    	  
//		    	        // 解析Response  
//		    	        if (respEvnt != null && respEvnt.getResponse() != null) {  
//		    	            Vector<VariableBinding> recVBs = (Vector<VariableBinding>) respEvnt.getResponse()  
//		    	            .getVariableBindings();  
//		    	            for (int i = 0; i < recVBs.size(); i++) {  
//		    	                VariableBinding recVB = recVBs.elementAt(i);  
//		    	                System.out.println(recVB.getOid() + " : " + recVB.getVariable());  
//		    	            }  
//		    	        }  
//		    	    }  
//	
//		    	    public void snmpTrapTest() {  
//		    	    	try {
//		    	    		System.out.println("go b");
//		    	    		run();
//		    	    		initComm1();  
//		    	            sendPDU1();
//						} catch (Exception e) {
//							// TODO: handle exception
//							e.printStackTrace();
//						}
//		    	    	 
//		    	   } 
//	
//}
