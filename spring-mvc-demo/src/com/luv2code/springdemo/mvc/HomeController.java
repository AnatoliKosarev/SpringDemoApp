package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// when user navigates to "/" url - we give him "/WEB-INF/view/main-menu.jsp" - resolver adds prefix and suffix
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

}
