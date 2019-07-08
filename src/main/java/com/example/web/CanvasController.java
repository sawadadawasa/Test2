package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/draw")
public class CanvasController {
	
	@RequestMapping("/")
	public String index() {
		
		return "draw";
	}

}