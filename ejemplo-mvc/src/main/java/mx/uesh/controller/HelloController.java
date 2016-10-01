package mx.uesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping ("/api")
public class HelloController {
	
	
	@RequestMapping (value = "/recuperaMensaje") 
	public ModelAndView redireccion (ModelMap model){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		mv.addObject("message"," Hola, este es un proyecto de Spring WEB MVC!");
		return mv;
	}
	

	@RequestMapping (value = "/index" , method = RequestMethod.GET)  
	public String index (ModelMap model){
		
		model.addAttribute("message","Hello Spring WEB MVC!");
		return "hola";
	}


}
