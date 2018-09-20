package springwork.controller.models;

import java.util.Date;

public class CreditCardInfo {
private long ccid;
private long cid;
private long ccnumber;
private int secId;
private int zip;
private Date expires;

public CreditCardInfo() {
	
}

public CreditCardInfo(long ccid, long cid, long ccnumber, int secId, int zip) {
	super();
	this.ccid = ccid;
	this.cid = cid;
	this.ccnumber = ccnumber;
	this.secId = secId;
	this.zip = zip;
}
public long getCcid() {
	return ccid;
}
public void setCcid(long ccid) {
	this.ccid = ccid;
}
public long getCid() {
	return cid;
}
public void setCid(long cid) {
	this.cid = cid;
}
public long getCcnumber() {
	return ccnumber;
}
public void setCcnumber(long ccnumber) {
	this.ccnumber = ccnumber;
}
public int getSecId() {
	return secId;
}
public void setSecId(int secId) {
	this.secId = secId;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public Date getExpires() {
	return expires;
}
public void setExpires(Date expires) {
	this.expires = expires;
}

}
