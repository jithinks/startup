package com.jks.startup.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jks.startup.model.LoginDO;
import com.jks.startup.service.LoginService;

@Controller
public class LoginController {
	   @Autowired
	    private LoginService loginService;
	   
	    private static final Logger logger = Logger.getLogger(LoginController.class);

	    //localhost:8080/startup/
		@RequestMapping(value = "/", method = RequestMethod.GET)
		//@ResponseBody
		public String showIndexPage() {
			System.out.println("Index service called!!");
			return "index";
		}

	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String showLoginPage() {
	        return "login";
	    }

	   @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public String handleUserLogin(ModelMap model, @ModelAttribute ("logindo") LoginDO logindo) {

	    	System.out.println("logindo:"+logindo);
	    	
	    	logger.debug("name:"+logindo.getName());
	    	logger.debug("password:"+logindo.getPassword());
	    	
	    	
	        if (!loginService.validateUser(logindo.getName(), logindo.getPassword())) {
	        	 model.put("errorMessage", "Invalid Credentials");
	        	 return "login";
	        }

	        model.put("name", logindo.getName());
	        return "welcome";
	    }

	    /* @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public String handleUserLogin(ModelMap model, @RequestParam String name,
	            @RequestParam String password) {

	    	System.out.println("name:"+name);
	    	System.out.println("password:"+password);

	    	logger.debug("name:"+name);
	    	logger.debug("password:"+password);

	        if (!loginService.validateUser(name, password)) {
	            model.put("errorMessage", "Invalid Credentials");
	            return "login";
	        }

	        model.put("name", name);
	        return "welcome";
	    }*/

}
