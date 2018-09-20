package springwork.controller.models;

import java.sql.Date;

public class PartnerSchedule {
private long scheduleid;
private String ampm;
private long partid;
private Date schedule;
private String city;
private String state;
private long sid;

public PartnerSchedule() {
	
}
public PartnerSchedule(long scheduleid, String ampm, long partid, Date schedule, String city, String state, long sid) {
	super();
	this.scheduleid = scheduleid;
	this.ampm = ampm;
	this.partid = partid;
	this.schedule = schedule;
	this.city = city;
	this.state = state;
	this.sid = sid;
}
public long getScheduleid() {
	return scheduleid;
}
public void setScheduleid(long scheduleid) {
	this.scheduleid = scheduleid;
}

public long getPartid() {
	return partid;
}
public void setPartid(long partid) {
	this.partid = partid;
}
public Date getSchedule() {
	return schedule;
}
public void setSchedule(Date schedule) {
	this.schedule = schedule;
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
public long getSid() {
	return sid;
}
public void setSid(long sid) {
	this.sid = sid;
}
public void setAmpm(String ampm) {
	this.ampm = ampm;
}
public String getAmpm() {
	return ampm;
}

}