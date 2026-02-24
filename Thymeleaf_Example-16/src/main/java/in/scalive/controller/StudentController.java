package in.scalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import in.scalive.model.Student;
@Controller
public class StudentController {
	
	@RequestMapping(method=RequestMethod.GET, value = "/")
	public String showRegForm(Model model) {
		Student studentForm=new Student();
		model.addAttribute("studentForm",studentForm);
		return "register-form";
	}
	@RequestMapping(method=RequestMethod.GET, value="/save")
	public String submitForm(@ModelAttribute("studentForm")Student studentForm) {
		return "register-success";
	}




}
