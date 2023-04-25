package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

//	Using Redirect
	
//	@RequestMapping("/first")
//	public String first() {
//		
//		System.out.println("First Handler");
//		return "redirect:/second";
//	}
	
//	Using RedirectView
	
	@RequestMapping("/first")
	public RedirectView first() {
		
		System.out.println("First Handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("second");
		
		return redirectView;
	}
	
	@RequestMapping("/second")
	public String second() {
		
		System.out.println("Second Handler");
		return "second";
	}
	
}
