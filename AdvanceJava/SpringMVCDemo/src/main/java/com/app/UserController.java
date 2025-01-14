package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@RequestMapping("/")
	public String showForm()
	{
		return "user-form";
	}
	
	@RequestMapping("display")
	public String displayForm(HttpServletRequest request,Model model)
	{
		String fname = request.getParameter("txtFirstName");
		String msg = "Hi "+fname.toLowerCase();
		model.addAttribute("message", msg);
		return "success";
	}
	
	@RequestMapping("display2")
	public String displayFormVersion2(@RequestParam("txtFirstName") String fname,Model model)
	{
		
		String msg = "Hello "+fname.toUpperCase();
		model.addAttribute("message", msg);
		return "success";
	}
	
	
	

}
