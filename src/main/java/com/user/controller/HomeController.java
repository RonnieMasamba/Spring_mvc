package com.user.controller;

import com.user.dto.User;
import com.user.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class HomeController {

	@Autowired
	private UserService service;

	private static final Logger logger = Logger.getLogger(HomeController.class);


	protected HomeController() {
		logger.info("Entering Home Controller Class");

	}

	@RequestMapping("registration")
	public String registerUser() {
		logger.debug("Home controller processing request");
		return "register";
		

	}
	@RequestMapping("viewUser")
	public String getUser(ModelMap model){
		List<User> users=service.getUsers();
		model.addAttribute("users",users);
		logger.debug("Home controller processing request");
		return "viewUser";

	}

	@RequestMapping( value ="registerUser", method= RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, Model model){
	int result =service.save(user);
		logger.debug(user);
		model.addAttribute("result","User created with ID" + result);
		return "viewUser";
	}

	}


