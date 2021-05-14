package com.example.wild;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wild")
public class WildResource {

	@GetMapping
	public String getWildAnimal() {
		return "Lion";
	}

}
