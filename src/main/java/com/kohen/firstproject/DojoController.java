package com.kohen.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	
	@RequestMapping("/dojo/{location}")
	public String showDojo(@PathVariable("location") String dojo) {
		return "The dojo is awesome!";
	}

	@RequestMapping("/burbank-dojo/{burbank}")
	public String burbank(@PathVariable("burbank") String burbank) {
		return "The Burbank dojo is located in Southern California";
	}

	@RequestMapping("/san-jose/{sanJ}")
	public String sanJ(@PathVariable("sanJ") String sanJ) {
		return "SJ dojo is the headquarters";
	}

}

//Create another controller named 'DojoController'. For the routes below, use the @PathVariable annotation.
//Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
//Have an http GET request to 'http://localhost:8080/burbank-dojo/' display a text that says 'Burbank Dojo is located in Southern California'.
//Have an http GET request to 'http://localhost:8080/san-jose/' display a text that says 'SJ dojo is the headquarters'.

//@RequestMapping("/m/{track}/{module}/{lesson}")
//public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
//	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
//}