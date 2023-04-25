package complexformusingspringmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class})
	public String errorhandlingnull(Model model)
	{
		model.addAttribute("code", "500");
		model.addAttribute("msg", "Null Pointer Exception");
		return "errorhandling";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NumberFormatException.class})
	public String errorhandlingnumberformat(Model model)
	{
		model.addAttribute("code", "400");
		model.addAttribute("msg", "Number Format Exception");
		return "errorhandling";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({Exception.class})
	public String errorhandlingallexception(Model model)
	{
		model.addAttribute("code", "500");
		model.addAttribute("msg", "Exception Occurred");
		return "errorhandling";
	}
}
