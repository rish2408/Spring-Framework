package complexformusingspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/submitform")
	public String submitform(@RequestParam("username") String username, Model model)
	{
		System.out.println(username);
		model.addAttribute("username", username);
		return "submitform";
	}
}
