package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping(value="/home/{a}")
	public String getValue(@PathVariable String a) {
		return "hii "+a;
	}

}
