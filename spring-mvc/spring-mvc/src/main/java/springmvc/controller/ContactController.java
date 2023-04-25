package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entity.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(path = "/contactus", method = RequestMethod.GET)
	public String contactus()
	{
		System.out.println("Contact Us Page");
		return "contactus";
	}
	
//	Using Old Servlet Method
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String formhandler(HttpServletRequest req)
//	{
//		String email = req.getParameter("email");
//		System.out.println(email);
//		return "success";
//	}
	
//	Using Spring MVC new Method @RequestParam
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String formhandler(@RequestParam(name = "email",required = false) String userEmail, 
//							@RequestParam(name = "username",required = true) String userName, 
//							@RequestParam(name = "password",required = true) String userPassword, Model model)
//	{
//		model.addAttribute("email", userEmail);
//		model.addAttribute("username", userName);
//		model.addAttribute("password", userPassword);
//		
//		return "success";
//	}
	
//	Using Spring MVC new Method @RequestParam and Entity User
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String formhandler(@RequestParam(name = "email",required = false) String userEmail, 
//							@RequestParam(name = "username",required = true) String userName, 
//							@RequestParam(name = "password",required = true) String userPassword, Model model)
//	{
//		
//		User user = new User(userEmail, userName, userPassword);
//		model.addAttribute("user", user);
//		
//		return "success";
//	}
	
//	Using Spring MVC @ModelAttribute and Entity User
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String formhandler(@ModelAttribute("user") User user, Model model)
	{
	
		if(user.getEmail().isBlank())
		{
			return "redirect:/contactus";
		}
		
		int createUser = this.userService.createUser(user);
		model.addAttribute("id", createUser);
		return "success";
	}
	
//	For any common data we need to send from controller to different views we have to use @ModelAttribute on class level
	
	@ModelAttribute
	public void commonDataHandler(Model model)
	{
		model.addAttribute("title", "Learn Code with Rishabh");
		LocalDateTime loc = LocalDateTime.now();
		model.addAttribute("dateandtime", loc);
		System.out.println("Adding Common Data to page");
	}
	
	
}
