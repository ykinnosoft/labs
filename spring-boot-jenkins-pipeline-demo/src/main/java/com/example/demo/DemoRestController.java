package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping(path = "/greeting")
	public String greeting(@RequestParam(required = false) String name) {
		
		if( null != name && !name.isEmpty())
			return "Namaste " + name;
		
		else
			return "Namaste..";
	}

}
