package springwork.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import springwork.controller.jdbc.CustomerRowMapper;
import springwork.controller.jdbc.UserRowMapper;
import springwork.controller.models.Customer;
import springwork.controller.models.User;


public class CustomerDAO implements CustomerDAOI{
JdbcTemplate template;  

	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  

     @Autowired
     DataSource datasource;
	
public int saveCustomer(Customer customer){  
    String sql="insert into customers(userid, city) values(?, ?)";  
  
    return template.update(sql,new Object[] {customer.getUserid(),customer.getCity()});  

}
 @Override
 public Customer getId(String userid) {
	 List<Customer> custList = new ArrayList<Customer>();  
	 String sql="select custid from customers where userid=" + userid;
	    
	  custList = template.query(sql, new CustomerRowMapper());  
	  return custList.get(0);  
 }

@Override
public void update(Customer customer){  
	
    String sql="update customers set city=? where custid=?";
    
    template.update(sql,  
      new Object[] { customer.getCity(), customer.getCustid() });  
 
}  
@Override
public int delete(String custid){  
    String sql="delete from customers where custid="+custid;  
    return template.update(sql);  
}  
@Override
public Customer getCustomerById(String custid){  
	
		  List<Customer> userList = new ArrayList<Customer>();  
		  String sql = "select * from customers where custid= " + custid;  
		    
		  userList = template.query(sql, new CustomerRowMapper());  
		  return userList.get(0);  
		 }  
	
   

}
