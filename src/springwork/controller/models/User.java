package springwork.controller.models;



public class User {
	
	
	private long userid;
	private String uname;
	private String pass;
		private String passw2;
		private String city;
		private String email;
	private String fname;
	private String lname;
	
public User() {
		
	}
	

	


	
	public User(long userid, String uname, String pass, String passw2, String city, String email, String fname,
		String lname) {
	super();
	this.userid = userid;
	this.uname = uname;
	this.pass = pass;
	this.passw2 = passw2;
	this.city = city;
	this.email = email;
	this.fname = fname;
	this.lname = lname;
}






	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPassw2() {
		return passw2;
	}
	public void setPassw2(String passw2) {
		this.passw2 = passw2;
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
