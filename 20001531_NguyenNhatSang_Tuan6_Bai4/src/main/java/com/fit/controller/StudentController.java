package com.fit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fit.entities.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public ModelAndView showForm() {
		return new ModelAndView("Student-form", "student", new Student());
	}
	
	@RequestMapping("/processForm")
	public ModelAndView processForm(@ModelAttribute("student") Student student) {
		return new ModelAndView("Student-confirmation", "student", student);
	}
}
