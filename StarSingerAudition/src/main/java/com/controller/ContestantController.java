package com.controller;


import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import com.model.Contestant;
import com.service.ContestantService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

//use appropriate annotation to configure ContestantController as Controller
public class ContestantController {
	
	//use appropriate annotation 
	private ContestantService contestantService;
   	     	      	 	
	//invoke the service class - addContestant method.
	public String addContestant(@ModelAttribute("contestant")Contestant contestant, BindingResult result,ModelMap model){
		
		//fill the code		 		
		return null;
	}

	//invoke the service class - viewAllContestants method.
	public String viewAllContestants(@ModelAttribute("contestant")Contestant contestant, ModelMap model) {				
		
		//fill the code		 		
				return null;
		 				
	}
	//Use appropriate Annotation
	public ModelAndView exceptionHandler(Exception exception) {
		
		//fill the code		 		
		return null;
	}
	
}
