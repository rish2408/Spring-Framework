package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("Welcome to Homepage.");
		model.addAttribute("name", "Rishabh Srivastava");
		model.addAttribute("id",12345);
		List<String> friends = new ArrayList<String>();
		friends.add("Rishabh");
		friends.add("Akash");
		friends.add("Vikas");
		
		model.addAttribute("friends", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model)
	{
		System.out.println("Welcome to About Page.");
		model.addAttribute("name", "Rishabh Srivastava");
		model.addAttribute("id",12345);
		List<String> friends = new ArrayList<String>();
		friends.add("Rishabh");
		friends.add("Akash");
		friends.add("Vikas");
		
		model.addAttribute("friends", friends);
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView mav = new ModelAndView();
		
		System.out.println("Welcome to Help Page.");
		mav.addObject("id",12345);
		mav.addObject("name", "Rishabh Srivastava");
		
		LocalDateTime loc = LocalDateTime.now();
		mav.addObject("currentDate", loc);
		
		mav.setViewName("help");
		
		return mav;
	}
}
