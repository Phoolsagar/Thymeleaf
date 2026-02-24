package in.scalive.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.scalive.model.Student;




@Controller
public class StudentController {
	
	@RequestMapping(value="/showCourses",method=RequestMethod.GET)
	public String showCourses(Model model) {
		String[]courses= {"Java","Spring Boot","React","Python"};
		model.addAttribute("courses",courses);
		return "show-courses";
	}
	
	@RequestMapping(value="/showStudents",method=RequestMethod.GET)
	public String showStudents(Model model) {
		List<Student>studentList=List.of(new Student(101,"Ravi", "Java"),new Student(102,"Ajay", "Spring Boot"),new Student(103,"Deepak", "React"));
		model.addAttribute("students",studentList);
		return "show-students";
	}



}
