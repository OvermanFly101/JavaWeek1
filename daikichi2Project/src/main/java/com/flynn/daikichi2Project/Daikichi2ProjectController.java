package com.flynn.daikichi2Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Daikichi2ProjectController {

	public static void main(String[] args) {
		SpringApplication.run(Daikichi2ProjectController.class, args);
	}
	@RequestMapping("/daikichi")
	public String welcome() {
		return "Welcome traveler to the web of fortunes! Choose from travel or lotto and test out your luck.";
	}
	
	@RequestMapping("/daikichi/travel")
	public String travel() {
		return "Sorry all our travel fortunetellers are out at the moment. Their fortunes were really good. Please come back later.";
	}
	
	@RequestMapping("/daikichi/travel/{where}")
	public String travel(@PathVariable("where") String destination) {
		return "Congratulations! You will soon travel to " + destination;
	}
	
	@RequestMapping("daikichi/lotto")
	public String lotto(){
		return "So you think you can win the lotto, huh? Get lost! We are out of lottos.";
	}
	
	@RequestMapping("daikichi/lotto/{number}")
	public String lotto(@PathVariable("number") Integer luckyNumber){
		if(luckyNumber %2 == 0) {
			return "You will take a grand journey in the near future but be weary of temting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and frineds.";
		}
	}

}
