package springwork.controller.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import springwork.controller.models.Customer;



public class CustomerExtractor implements ResultSetExtractor<Customer> {
	 public Customer extractData(ResultSet resultSet) throws SQLException,  
	   DataAccessException {  
	    
	  Customer customer = new Customer();  
	    
	  customer.setCustid(resultSet.getLong(1)); 
	  customer.setUserid(resultSet.getLong(2));  
	  customer.setCity(resultSet.getString(3));
	 
	  
	    
	  return customer;  
}
}