package springwork.controller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import springwork.controller.jdbc.UserRowMapper;
import springwork.controller.models.Customer;
import springwork.controller.models.User;

public class UserDAO implements UserDAOI{
	JdbcTemplate template;  
	
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  

     @Autowired
     DataSource datasource;
     public int saveCustomer(User user){  
    	    String sql="insert into customers(userid, city) values(?, ?)";  
    	  
    	    return template.update(sql,new Object[] {user.getUserid(),user.getCity()});  

    	}
    	 
public int saveFirstPage(User user){  
    String sql="insert into reguser(userid,uname,pass,passw2, city, email) values(?,?,?, ?, ?, ?)";  
  
    return template.update(sql, new Object[] {user.getUserid(),user.getUname(), user.getPass(), user.getPassw2(),user.getCity(),user.getEmail()});  

}
 
@Override
public int updatenames(User user) {
	String sql="update reguser set fname=?, lname=? where userid=?";
	return template.update(sql, new Object[] {user.getFname(), user.getLname(), user.getUserid()});
}
@Override
public void update(User user){  
	
    String sql="update reguser set email=?, city=?, pass=?, passw2=?, fname=?, lname=? where userid=?";
    
    template.update(sql,  
      new Object[] { user.getEmail(), user.getCity(),user.getPass(),  
        user.getPassw2(), user.getFname(), user.getLname(), user.getUserid() });  
 // return template.update(sql, user.getEmail(),user.getPass(), user.getPassw2(), user.getFname(), user.getLname(), user.getEmail());
   
}  
@Override
public int delete(String userid){  
    String sql="delete from reguser where userid="+userid;  
    return template.update(sql);  
}  
@Override
public User getUserById(String userid){  
	
		  List<User> userList = new ArrayList<User>();  
		  String sql = "select * from reguser where userid= " + userid;  
		    
		  userList = template.query(sql, new UserRowMapper());  
		  return userList.get(0);  
		 }  
/*	
@Override
public boolean isValidUser(String uname, String pass) throws SQLException
{
	String query = "Select count(1) from reguser where uname = ? and pass = ?";
	PreparedStatement pstmt = datasource.getConnection().prepareStatement(query);
	pstmt.setString(1, uname);
	pstmt.setString(2, pass);
	ResultSet resultSet = pstmt.executeQuery();
	if(resultSet.next())
	    return (resultSet.getInt(1) > 0);
    else
       return false;
   } */



@Override
public List<User> getUsers(){  
    return template.query("select * from reguser",new RowMapper<User>(){  
        public User mapRow(ResultSet rs, int row) throws SQLException {  
            User user=new User();  
            user.setUserid(rs.getLong("userid"));  
            user.setUname(rs.getString("uname"));  
            user.setPass(rs.getString("pass"));  
            user.setPassw2(rs.getString("passw2"));  
            user.setEmail(rs.getString("email"));  
            user.setFname(rs.getString("fname"));  
            user.setLname(rs.getString("lname")); 
            return user;  
        }  
    });  
}



}
