package springwork.controller.jdbc;



import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;

import springwork.controller.models.User;  

  
public class UserExtractor implements ResultSetExtractor<springwork.controller.models.User> {  
  
 public User extractData(ResultSet resultSet) throws SQLException,  
   DataAccessException {  
    
  User user = new User();  
    
  user.setUserid(resultSet.getLong(1));  
  user.setUname(resultSet.getString(2));  
  user.setPass(resultSet.getString(3));  
  user.setPassw2(resultSet.getString(4));  
  user.setCity(resultSet.getString(5));
  user.setEmail(resultSet.getString(6));  
  user.setFname(resultSet.getString(7));  
  
  user.setLname(resultSet.getString(8));
  
    
  return user;  
 }  
  
}  