package complexformusingspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import complexformusingspringmvc.entity.Student;

@Controller
public class ComplexFormController {

	@RequestMapping("/complex-form")
	public String showForm()
	{
		String str = null;
		str.length();
		System.out.println("Form is Opening");
		return "complex-form";
	}
	
//	Example for forced exception
	
//	@RequestMapping("/complex-form/{username}")
//	public String showForm(@PathVariable("username") String username)
//	{
//		Integer.parseInt(username);
//		System.out.println("Form is Opening");
//		
//		return "complex-form";
//	}
	
//	Path Variable example
	
//	@RequestMapping("/complex-form/{userId}/{userName}")
//	public String showForm(@PathVariable("userId") int userId,
//							@PathVariable("userName") String userName)
//	{
//		System.out.println(userId);
//		System.out.println(userName);
//		System.out.println("Form is Opening");
//		return "complex-form";
//	}
	
	@RequestMapping("/resources")
	public String showresources()
	{
		System.out.println("Checking attached Resources");
		return "resourcescheck";
	}
	
//	Using RequestParm
	
//	@RequestMapping(path = "/processform",method = RequestMethod.POST)
//	public String processform(@RequestParam("name") String name,@RequestParam("date") String date)
//	{
//		System.out.println("Going to success page");
//		System.out.println(name);
//		System.out.println(date);
//		return "success";
//	}
	
//	Using ModelAttribute
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String processform(@ModelAttribute("student") Student student, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complex-form";
		}
		
		System.out.println("Going to success page");
		System.out.println(student);
		return "success";
	}
	
}
