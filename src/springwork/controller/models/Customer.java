package springwork.controller.models;

public class Customer {
private long custid;
private long userid;
private String city;
public Customer() {
	
}


public Customer(long custid, long userid, String city) {
	super();
	this.custid = custid;
	this.userid = userid;
	this.city = city;
}


public long getCustid() {
	return custid;
}
public void setCustid(long custid) {
	this.custid = custid;
}

public long getUserid() {
	return userid;
}

public void setUserid(long userid) {
	this.userid = userid;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

}
