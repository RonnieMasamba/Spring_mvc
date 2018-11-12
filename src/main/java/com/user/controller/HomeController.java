package com.user.controller;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static final Logger logger = Logger.getLogger(HomeController.class);

	protected HomeController() {
		logger.info("Entering Home Controller Class");

	}

	@RequestMapping("/home")
	public String home() {
		logger.debug("Home controller processing request");
		return "home";
		
		
		

	}

}
