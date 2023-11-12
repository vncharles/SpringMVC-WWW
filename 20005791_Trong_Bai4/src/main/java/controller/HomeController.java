package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showMyPage() {
		return "main-menu";
	}
	
	// Annotation 
	@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld() 
	{
	    return "Hello World!";
	}
}
