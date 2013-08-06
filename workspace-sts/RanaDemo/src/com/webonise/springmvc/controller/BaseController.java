package com.webonise.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BaseController{
 
   @RequestMapping(method = RequestMethod.GET)
   
   public String  printHello(ModelMap model) {
   
	   String name="NAME";
	   
	   model.addAttribute("message", name);
	   
	   return "rana";
      
   }

}

