package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Hello + TAP! from TAP and even more TAP+ TAPPPP";
	}


	@RequestMapping("/hello")
	public String hello() {
		return "Hello from the hello route";
	}

	@RequestMapping("/goodbye")
	public String goodbye() {
		return "Goodbye from the goodbye route";
	}

}
