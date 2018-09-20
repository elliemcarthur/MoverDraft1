package springwork.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import springwork.controller.dao.CustomerDAO;
import springwork.controller.dao.UserDAO;
import springwork.controller.models.Customer;
import springwork.controller.models.User;

@Controller
@ControllerAdvice
@SessionAttributes("user")
public class DashboardController {
	@Autowired
	private UserDAO userdao;
	private CustomerDAO customerdao;
	@ModelAttribute("user")
	public User setUpUserForm() {
		return new User();
	}

	//@ModelAttribute("user")
	@RequestMapping(value="/userdashboard")
	public ModelAndView loadHomeDash(@ModelAttribute("user") User user) {
		return new ModelAndView("userdashboard");
	}
	@RequestMapping(value="/verifycustomer")
	public ModelAndView verifyCust() {
		ModelAndView mav=new ModelAndView("verifycustomer");
		return mav;
	}

	@RequestMapping("/edituser")
		 public ModelAndView editUser(@RequestParam String userid,  
				   @ModelAttribute User user) {  
		System.out.println("userid="+userid);
				  user = userdao.getUserById(userid);
				 
				  List<String> cityList = new ArrayList<String>();  
				  cityList.add("New York");  
				  cityList.add("Long Island");  
				  cityList.add("Yonkers");  
				  cityList.add("Hoboken");
				 
				  
				  Map<String, Object> map = new HashMap<String, Object>();  
				  
				  map.put("cityList", cityList);  
				  map.put("user", user);  
				  
				  return new ModelAndView("edit", "map", map);  
				  
				 }  
	
	
	@RequestMapping(value="/editsave", method=RequestMethod.POST)
	public ModelAndView editSave(@ModelAttribute("user") User user, @PathVariable("uname") String uname) {
		userdao.update(user);
		
		return new ModelAndView("error");
	}
	@RequestMapping(value="deleteuser")
	public String deleteUser(@RequestParam String userid) {
		System.out.println("userid="+userid);
		userdao.delete(userid);
		return "dashboard/delete";
		
	}
	
	@RequestMapping("/dashboardcontact")
	public ModelAndView loadAboutFromDash() {
		ModelAndView mav = new ModelAndView("dashboard/contact2");
		return mav;
	}
	@RequestMapping("/clientreg")
	public ModelAndView loadClientReg(@ModelAttribute("user")User user, BindingResult resultUser, @ModelAttribute("customer")Customer customer, BindingResult resultProfile){
		
		ModelAndView mav=new ModelAndView("dashboard/clientreg");
		return mav;
	}

	@RequestMapping("/partnerreg")
	public ModelAndView loadPartnerReg() {
		ModelAndView mav=new ModelAndView("dashboard/partnerreg");
		return mav;
	}
	@RequestMapping("/logout")
	public ModelAndView logOut() {
		ModelAndView mav=new ModelAndView("dashboard/logout");
		return mav;
	}

	

}

