package springwork.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class MainController {
	
	

	@RequestMapping("/")
	public ModelAndView loadSite() {
		ModelAndView mav= new ModelAndView("index");
		return mav;
	}

	@RequestMapping("/home")
	public ModelAndView loadHomePage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	
	@RequestMapping("/about")
	public ModelAndView loadAboutPage() {
		ModelAndView mav = new ModelAndView("overview");
		return mav;
	}
	@RequestMapping("/contact")
	public ModelAndView loadContactPage() {
		ModelAndView mav = new ModelAndView("contact");
		return mav;
	}
	@RequestMapping("/login")
	public ModelAndView loginpage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
}
