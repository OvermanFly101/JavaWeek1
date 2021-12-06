package com.flynn.helloHuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController 
public class HelloHumanController {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanController.class, args);
	}
	
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String firstName, @RequestParam(value="last_name", required=false) String lastName) {
    	
        	if(firstName == null && lastName == null) {
        		return "Hello Human";
        	}else if(firstName != null && lastName == null){
        		return "Hello " + firstName;
        	}else if(firstName == null && lastName != null) {
        		return "Hello child of the " + lastName + " house."; 
        	}else {
        		return "Hello " + firstName + " " + lastName;
        	}
    }

}
//...

	

