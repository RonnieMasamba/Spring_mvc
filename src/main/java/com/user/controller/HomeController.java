package com.user.controller;

import com.user.dao.UserDAOImpl;
import com.user.dto.User;
import com.user.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Controller
public class HomeController {

	@Autowired
	private UserService service;

	private static final Logger logger = Logger.getLogger(HomeController.class);


	protected HomeController() {
		logger.info("Entering Home Controller Class");

	}

	@RequestMapping("/registration")
	public String registerUser() {
		logger.debug("Home controller processing request");
		return "regUser";
		
	}
	@RequestMapping( value ="registerUser", method= RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, Model model){
	int result =service.save(user);
		logger.debug(user);
		model.addAttribute("result","User created with ID" + result);
		return "regResult";
	}

	}


