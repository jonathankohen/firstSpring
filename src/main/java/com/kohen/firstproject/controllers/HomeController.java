package com.kohen.firstproject.controllers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model, HttpSession session) {
		model.addAttribute("dojoName", "Burbank");
		Integer views = (Integer) session.getAttribute("pageViews");
		if(views == null) {
			views = 0;
		}
		views++;
		session.setAttribute("pageViews", views);
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter(Model model, HttpSession session) {
		Integer views = (Integer) session.getAttribute("pageViews");
		model.addAttribute("pageViews", views);
		return "counter.jsp";
	}

	@GetMapping("/date")
	public String date(Model model) {
		LocalDate dateObj = LocalDate.now();
	    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("EEEE',' 'the' dd 'of' MMMM',' yyyy");

	    String formattedDate = dateObj.format(formatObj);
		model.addAttribute("currentDate", formattedDate);
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		LocalTime timeObj = LocalTime.now();
	    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("hh':'mm a");

	    String formattedTime = timeObj.format(formatObj);
		model.addAttribute("currentTime", formattedTime);
		return "time.jsp";
	}
	
	@GetMapping("/code")
	public String code() {
		return "code.jsp";
	}
	
	@PostMapping("/try_code")
	public String try_code(@RequestParam(value="codeInput") String codeInput, RedirectAttributes flash) {
		if(codeInput.equals("bushido")) {
			return "redirect:/code";
		} else {
			flash.addFlashAttribute("codeError", "Incorrect code!");
			return "redirect:/";
		}
	}
}


