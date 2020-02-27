package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	
	// create a controller method to show the form
	@RequestMapping("showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// create a controller method to process the form
	@RequestMapping("processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// add a new method to read form data and add data to the model
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		
		// convert the data to all caps
		name = name.toUpperCase();
		
		// create the message
		String result = "Yo! " + name; 
		
		//add the message to the model, where "message" is the name of the parameter that we give and it should be the same as on html page, where we retrieve it
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("processFormVersionThree")
	public String processFormVersionThree(
			// @RequestParam assigns value from "studentName" parameter to String name
			@RequestParam("studentName") String name, 
			Model model) {
		
		name = name.toUpperCase();
		
		String result = "Hey, my friend from v3! " + name;
		
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}

}










