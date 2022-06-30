package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	
	@GetMapping("/listboard")
	public String listBoard() {
		return "게시물 목록";
	}
}
