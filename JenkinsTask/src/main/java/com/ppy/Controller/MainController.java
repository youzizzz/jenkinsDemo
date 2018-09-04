package com.ppy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/index")
	public String index() {
		return "hello,Jenkins";
	}
}
