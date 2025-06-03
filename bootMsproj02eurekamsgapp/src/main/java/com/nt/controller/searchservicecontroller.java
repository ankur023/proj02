package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/search")

public class searchservicecontroller {
	@GetMapping("/web")
	public String displaymsg() {
		return"welcome the my website";
	}

}
