package com.manzuraz.dojosurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(path="/result" , method=RequestMethod.POST)
	public String submit(Model m, @RequestParam(value="name") String name, @RequestParam(value="dojolocation") String location,  @RequestParam(value="favoriteLanguage") String language, @RequestParam(value="comment") String comment ) {
		m.addAttribute("name", name);
		m.addAttribute("location", location);
		m.addAttribute("language", language);
		m.addAttribute("comment", comment);
		return "result.jsp";
	}
	
}
