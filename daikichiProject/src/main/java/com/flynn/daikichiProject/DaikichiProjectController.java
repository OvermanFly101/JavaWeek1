package com.flynn.daikichiProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController 
public class DaikichiProjectController {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiProjectController.class, args);
	}
	
	@RequestMapping("/daikichi")
	public String main() {
		return "Welcome fellow traveler!";
	}
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String hello() {
		return "Tomorrow, an oppurtunity will arise, so be sure to be open to new ideas!";
	}
	
}
