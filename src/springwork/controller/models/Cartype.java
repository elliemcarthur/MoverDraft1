package springwork.controller.models;

public class Cartype {
	private long carreqno;
private int needcar;
private String carpref;
private long ccid;

public Cartype() {
	
}
public Cartype(long carreqno, int needcar, String carpref, long ccid) {
	super();
	this.carreqno = carreqno;
	this.needcar = needcar;
	this.carpref = carpref;
	this.ccid = ccid;
}
public int getNeedcar() {
	return needcar;
}
public void setNeedcar(int needcar) {
	this.needcar = needcar;
}
public String getCarpref() {
	return carpref;
}
public void setCarpref(String carpref) {
	this.carpref = carpref;
}
public long getCcid() {
	return ccid;
}
public void setCcid(long ccid) {
	this.ccid = ccid;
}
public long getCarreqno() {
	return carreqno;
}
public void setCarreqno(long carreqno) {
	this.carreqno = carreqno;
}
}
