package springwork.controller.models;

public class Payment {
	private long payid;
	private long ccid;
	private long sid;
	private long carreqno;
	public long getPayid() {
		return payid;
	}
	public void setPayid(long payid) {
		this.payid = payid;
	}
	public long getCcid() {
		return ccid;
	}
	public void setCcid(long ccid) {
		this.ccid = ccid;
	}
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public long getCarreqno() {
		return carreqno;
	}
	public void setCarreqno(long carreqno) {
		this.carreqno = carreqno;
	}

	
}
