package springwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@ControllerAdvice
@SessionAttributes("user")

public class CustomerController {

}
