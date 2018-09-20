package springwork.controller.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public boolean isValidUser(String uname, String pass) {
	     boolean retVal;
	     try { 
	          String SQL = "select count(*) from reguser where uname= ? and pass = ?";
	          int count = jdbcTemplate.queryForObject(SQL, new Object[]{uname, pass}, Integer.class);

	          if (count == 1) {
	               retVal = true;
	          } else {
	               retVal = false;
	          }
	     } catch (Exception ex) { 
	         retVal = false;
	     }
	     return retVal;
	}
}
