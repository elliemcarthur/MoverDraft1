package springwork.controller.dao;

import java.util.List;

import springwork.controller.models.Customer;

public interface CustomerDAOI {

	void update(Customer customer);

	int delete(String custid);

	Customer getCustomerById(String custid);

	Customer getId(String userid);

	


	
}
