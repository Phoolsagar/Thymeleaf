package in.scalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class GreetingsController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/greet")
	public String greetings(Model m) {
		m.addAttribute("msg","This is my first Thymleaf ");
		return "greetings";
	}

}
