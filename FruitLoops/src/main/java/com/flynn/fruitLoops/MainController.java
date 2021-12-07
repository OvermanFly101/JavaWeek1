package com.flynn.fruitLoops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<Fruits> fruitList = new ArrayList<Fruits>();
		Fruits a = new Fruits("Guava", 0.75);
		Fruits b = new Fruits("Kiwi", 1.5);
		Fruits c = new Fruits("Mango", 2.0);
		Fruits d = new Fruits("Goji Berries", 4.0);
		
		fruitList.add(a);
		fruitList.add(b);
		fruitList.add(c);
		fruitList.add(d);
		
		model.addAttribute("fruits", fruitList);
		return "index.jsp";
	}
}
