package com.jsp.book_my_ticket.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String load()
	{
		return "home.html";
	}

}
