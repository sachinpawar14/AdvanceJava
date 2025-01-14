package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Student;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		Student theStudent = new Student();
		theModel.addAttribute("student",theStudent);
		return "student-form";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student theStudent)
	{
		System.out.println(theStudent);
		return "success";
	}

}
