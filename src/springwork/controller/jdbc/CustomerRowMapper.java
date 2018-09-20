package springwork.controller.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springwork.controller.models.Customer;
import springwork.controller.models.User;

public class CustomerRowMapper implements RowMapper<Customer> {
	@Override  
	 public Customer mapRow(ResultSet resultSet, int line) throws SQLException {  
	  CustomerExtractor customerExtractor = new CustomerExtractor();  
	  return customerExtractor.extractData(resultSet);  
	 }  
	  
}
