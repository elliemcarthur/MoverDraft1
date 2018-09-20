package springwork.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import springwork.controller.dao.LoginDAO;
import springwork.controller.models.User;


@Controller
@SessionAttributes("user")
public class LoginController
{

	@RequestMapping(value="/login")
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("login");
		User user = new User();
		model.addObject("user", user);
		return model;
	}
	
	/*
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user")User user)
	{
		ModelAndView model= null;
		try
		{
			boolean isValidUser = loginDelegate.isValidUser(user.getUname(), user.getPass());
			if(isValidUser)
			{
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", user.getUname());
				model = new ModelAndView("welcome");
			}
			else
			{
				model = new ModelAndView("login");
model.addObject("user", user);
				request.setAttribute("message", "Invalid credentials!!");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return model;
	}
	*/
	@Autowired
	LoginDAO dao;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest request, @ModelAttribute("user") User user) {
	   boolean result;
	   ModelAndView modelAndView = null;
	   String uname = user.getUname();
	   String pass = user.getPass();
	 
	   if (user != null && uname != null && pass != null) {
	       result = dao.isValidUser(uname, pass);
	       if (result == true) {
	           modelAndView = new ModelAndView("welcome");
	       } else {
	           modelAndView = new ModelAndView("login");
	           modelAndView.addObject("message", "Wrong user name or password");
	       }
	   } else {
	       modelAndView = new ModelAndView("login");
	       modelAndView.addObject("message", "Error occurred while processing");
	   }
	 return modelAndView;
	}
}
