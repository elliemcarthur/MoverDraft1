package springwork.controller.models;

import java.util.Date;

public class CustSchedule {
private long sid;
private String ampm;
private Date sched;
private String city;
private String state;
private long ccid;

public CustSchedule() {
	
}


public CustSchedule(long sid, String ampm, Date sched, String city, String state, long ccid) {
	super();
	this.sid = sid;
	this.ampm = ampm;
	this.sched = sched;
	this.city = city;
	this.state = state;
	this.ccid = ccid;
}


public long getSid() {
	return sid;
}
public void setSid(long sid) {
	this.sid = sid;
}
public String getAmpm() {
	return ampm;
}
public void setAmpm(String ampm) {
	this.ampm = ampm;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public long getCcid() {
	return ccid;
}
public void setCcid(long ccid) {
	this.ccid = ccid;
}
public Date getSched() {
	return sched;
}
public void setSched(Date sched) {
	this.sched = sched;
}

}
