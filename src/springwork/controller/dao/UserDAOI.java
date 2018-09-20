package springwork.controller.dao;

import java.util.List;

import springwork.controller.models.User;

public interface UserDAOI {


public void update(User user);


public List<User> getUsers();
int updatenames(User user);
int saveFirstPage(User user);

int delete(String userid);


User getUserById(String userid);



    
}  

