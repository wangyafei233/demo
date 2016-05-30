package demo.ax.dao;

import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.management.ManagementFactory;

import com.sun.management.OperatingSystemMXBean;

import demo.ax.dao.Bytes;

public class ComputerData {
	private static final int CPUTIME = 500;

	private static final int PERCENT = 100;

	private static final int FAULTLENGTH = 10;
	OperatingSystemMXBean osmxb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
	String osName = System.getProperty("os.name");

	public long GetTotalPhysicalMemorySize() {
		// 最大物理存储空间
		int kb = 1024;
		long xwx = osmxb.getTotalPhysicalMemorySize() / kb;
		return xwx;
	}

	public long getTotalMemory() {
		// 总内存
		int kb = 1024;
		long xwx = Runtime.getRuntime().totalMemory() / kb;
		return xwx;
	}

	public long getFreeMemory() {
		// 剩余内存
		int kb = 1024;
		long xwx = Runtime.getRuntime().freeMemory() / kb;
		return xwx;
	}

	public double getCpuRatioForWindows() { // jincheng
		try {
			String procCmd = System.getenv("windir") + "//system32//wbem//wmic.exe process get Caption,CommandLine,"
					+ "KernelModeTime,ReadOperationCount,ThreadCount,UserModeTime,WriteOperationCount";
			// 取进程信息
			long[] c0 = readCpu(Runtime.getRuntime().exec(procCmd));

			Thread.sleep(CPUTIME);
			long[] c1 = readCpu(Runtime.getRuntime().exec(procCmd));
			if (c0 != null && c1 != null) {
				double x;
				long idletime = c1[0] - c0[0];
				long busytime = c1[1] - c0[1];
				x = Double.valueOf(x = PERCENT * (busytime) / (busytime + idletime)).doubleValue();
				return Double.valueOf(x = PERCENT * (busytime) / (busytime + idletime)).doubleValue();
			} else {
				return 0.0;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0.0;
		}
	}

	public long[] readCpu(final Process proc) { // **cpu
		long[] retn = new long[2];
		try {
			proc.getOutputStream().close();
			InputStreamReader ir = new InputStreamReader(proc.getInputStream());
			LineNumberReader input = new LineNumberReader(ir);
			String line = input.readLine();
			if (line == null || line.length() < FAULTLENGTH) {
				return null;
			}
			int capidx = line.indexOf("Caption");
			int cmdidx = line.indexOf("CommandLine");
			int rocidx = line.indexOf("ReadOperationCount");
			int umtidx = line.indexOf("UserModeTime");
			int kmtidx = line.indexOf("KernelModeTime");
			int wocidx = line.indexOf("WriteOperationCount");
			long idletime = 0;
			long kneltime = 0;
			long usertime = 0;
			while ((line = input.readLine()) != null) {
				if (line.length() < wocidx) {
					continue;
				}
				// 字段出现顺序：Caption,CommandLine,KernelModeTime,ReadOperationCount,
				// ThreadCount,UserModeTime,WriteOperation
				String caption = Bytes.substring(line, capidx, cmdidx - 1).trim();
				String cmd = Bytes.substring(line, cmdidx, kmtidx - 1).trim();
				if (cmd.indexOf("wmic.exe") >= 0) {
					continue;
				}
				// log.info("line="+line);
				if (caption.equals("System Idle Process") || caption.equals("System")) {
					idletime += Long.valueOf(Bytes.substring(line, kmtidx, rocidx - 1).trim()).longValue();
					idletime += Long.valueOf(Bytes.substring(line, umtidx, wocidx - 1).trim()).longValue();
					continue;
				}

				kneltime += Long.valueOf(Bytes.substring(line, kmtidx, rocidx - 1).trim()).longValue();
				usertime += Long.valueOf(Bytes.substring(line, umtidx, wocidx - 1).trim()).longValue();
			}
			retn[0] = idletime;
			retn[1] = kneltime + usertime;
			return retn;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				proc.getInputStream().close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}