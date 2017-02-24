package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${name}") String name;
	@Value("${author}") String author;
	@Value("${city}") String city;

	@RequestMapping("/show-config")
	public String showConfig() {
		return "name: " + name + "<br/>author: " + author + "<br/>city: " + city;
	}
}
