package com.kohen.firstproject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		LocalDate dateObj = LocalDate.now();
	    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("EEEE',' 'the' dd 'of' MMMM',' yyyy");

	    String formattedDate = dateObj.format(formatObj);
		model.addAttribute("currentDate", formattedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalTime timeObj = LocalTime.now();
	    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("hh':'mm a");

	    String formattedTime = timeObj.format(formatObj);
		model.addAttribute("currentTime", formattedTime);
		return "time.jsp";
	}
}


