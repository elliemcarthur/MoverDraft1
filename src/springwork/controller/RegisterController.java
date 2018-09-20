package springwork.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import springwork.controller.dao.CustomerDAO;
import springwork.controller.dao.UserDAO;
import springwork.controller.models.User;


@Controller
@ControllerAdvice
@SessionAttributes("user")
public class RegisterController {
	@Autowired
	private UserDAO userdao;
	private CustomerDAO customerdao;
	@ModelAttribute("user")
	public User setUpUserForm() {
		return new User();
	}
	@RequestMapping("/register")
	public ModelAndView registerpage() {
		ModelAndView mav = new ModelAndView("register2");
		return mav;
	}
	
	@ModelAttribute
	public void addAttributes(Model model) {
		model.addAttribute("msg", "Almost done...");
	}
	@RequestMapping(value="/registersubmission", method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		
		userdao.saveFirstPage(user);
		
		ModelAndView mav = new ModelAndView("finalquestions");
		return mav;
	}
	
	@RequestMapping(value="/userdashboard", method=RequestMethod.POST)
	public ModelAndView registernames(@ModelAttribute("user") User user){
		userdao.updatenames(user);
		
		ModelAndView mav=new ModelAndView("userdashboard");
		return mav;
	} 
	
	/*
	@RequestMapping(value="/registersubmission", method=RequestMethod.GET)
	
	public String registersub(@ModelAttribute User user, 
		BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			return "error";
		}
	    model.addAttribute("uname", user.getUname());
	      model.addAttribute("pass", user.getPass());
	      model.addAttribute("email", user.getEmail());
	      return "finalquestions";
	} 
	@RequestMapping(value="/userdashboard", method=RequestMethod.POST)
	public String registernames(@ModelAttribute User user, 
		BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			return "error";
		}
	    model.addAttribute("fname", user.getFname());
	      model.addAttribute("lname", user.getLname());
	      
	      return "userdashboard";
	}
	*/
}
