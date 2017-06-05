package com.springstudy.controller;
import org.springframework.stereotype.Controller; 

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;  
  
@Controller
  
public class HelloController { 
  
	@ResponseBody
	@RequestMapping(value="/getString",method=RequestMethod.GET)
	public String getString(){
		return "wo shi String";
	}
  
   @RequestMapping("/hello") 
  
   public ModelAndView hello(){ 
  
     ModelAndView mv =new ModelAndView(); 
  
     mv.addObject("spring", "spring mvc"); 
  
     mv.setViewName("hello"); 
  
     return mv; 
  
   } 
  
}