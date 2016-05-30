package demo.ax.servlet;

public class database {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String cpuname;
	private String memoryname;
	private String osname;
	private String maxmemoryname;
	private String wulimemoryname;
	
	public String getCpuname() {
		return cpuname;
	}
	public void setCpuname(String cpuname) {
		this.cpuname = cpuname;
	}
	public String getMemoryname() {
		return memoryname;
	}
	public void setMemoryname(String memoryname) {
		this.memoryname = memoryname;
	}
	public String getOsname() {
		return osname;
	}
	public void setOsname(String osname) {
		this.osname = osname;
	}
	public String getMaxmemoryname() {
		return maxmemoryname;
	}
	public void setMaxmemoryname(String maxmemoryname) {
		this.maxmemoryname = maxmemoryname;
	}
	public String getWulimemoryname() {
		return wulimemoryname;
	}
	public void setWulimemoryname(String wulimemoryname) {
		this.wulimemoryname = wulimemoryname;
	}


}
