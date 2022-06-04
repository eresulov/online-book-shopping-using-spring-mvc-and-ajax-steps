package az.developia.bookshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class HomeController {

	

	
	@GetMapping(path="/home")
	public String showHomePage() {
		return "home";
	}
}