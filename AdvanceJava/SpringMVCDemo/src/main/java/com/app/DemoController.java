package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("/")
	public String sayHello()
	{
		return "main-menu";///WEB-INF/views/main-menu.jsp
	}
	
	
}
