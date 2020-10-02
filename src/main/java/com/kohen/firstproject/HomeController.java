package com.kohen.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {

	@RequestMapping("")
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping("/another")
	public String another() {
		return "Another";
	}
}
