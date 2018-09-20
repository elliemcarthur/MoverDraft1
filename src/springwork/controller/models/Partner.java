package springwork.controller.models;

public class Partner {
	private long partid;
	private long userid;
	private String city;
	private String state;
	private int gotcar;
	private String cartype;
	
	public Partner() {
		
	}


public Partner(long partid, long userid, String city, String state, int gotcar, String cartype) {
		super();
		this.partid = partid;
		this.userid = userid;
		this.city = city;
		this.state = state;
		this.gotcar = gotcar;
		this.cartype = cartype;
	}


public long getPartid() {
	return partid;
}
public void setPartid(long partid) {
	this.partid = partid;
}
public long getUserid() {
	return userid;
}
public void setUserid(long userid) {
	this.userid = userid;
}
public int getGotcar() {
	return gotcar;
}
public void setGotcar(int gotcar) {
	this.gotcar = gotcar;
}
public String getCartype() {
	return cartype;
}
public void setCartype(String cartype) {
	this.cartype = cartype;
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
}