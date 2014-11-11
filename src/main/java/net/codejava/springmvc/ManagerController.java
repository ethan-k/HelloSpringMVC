package net.codejava.springmvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/manager/**", method = RequestMethod.GET)
public class ManagerController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManagerController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public String deleteUser(Locale locale, Model model, int id) {
		
		model.addAttribute("message", "Complete to Delete User (id="+id+")");
		
		return "deleteUserComplete";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {
	    String greetings = "Greetings, Spring MVC!";
	    model.addAttribute("message", greetings);
	 
	    return "test";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String result(Model model, @RequestParam("a") int a, @RequestParam("b") int b) {
		//	int result = a+b;
	    //String greetings = "a + b ="+result;
		
	    model.addAttribute("result", a+b);
	 
	    return "result";
	}
	
}
