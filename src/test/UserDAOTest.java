package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.test.context.ContextConfiguration;

import springwork.controller.dao.UserDAO;
import springwork.controller.models.AppConfig;
import springwork.controller.models.User;


@ContextConfiguration(classes = AppConfig.class)
public class UserDAOTest {
	@Autowired
private UserDAO userdao =new UserDAO();
	
	
	@Test
	public void testSetTemplate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveCustomer() {
	
	}

	@Test
	public void testSaveFirstPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdatenames() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserById() {
		 User user = userdao.getUserById("9999999999");
 Assert.assertEquals("9999999999", user.getUserid());
	        Assert.assertEquals("love", user.getUname());
	        Assert.assertEquals("Ellie", user.getFname());
	        Assert.assertEquals("McArthur", user.getLname());
	        Assert.assertEquals("New York", user.getCity());
	        Assert.assertEquals("pas@gmail.com", user.getEmail());
	        Assert.assertEquals("pas", user.getPass());
	        Assert.assertEquals("pas", user.getPassw2());
	        return;
	}

	@Test
	public void testGetUsers() {
	
	}

}
