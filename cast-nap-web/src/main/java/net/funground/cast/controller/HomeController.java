package net.funground.cast.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class HomeController {
	
	@GetMapping(value="/ping")
	public boolean ping() {
		return true;
	}
}
