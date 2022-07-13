package com.example.addController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.addnumber.Addtion;

@Controller
public class AddController {

	@GetMapping("/index")
	public String ViewForm(Model model) {
		model.addAttribute("Addition", new Addtion());
		return "index";
	}
	
	@PostMapping("/addtion")
	public String addForm(@ModelAttribute Addtion addtion, BindingResult result, Model model) {
		
		model.addAttribute("addtion", addtion);
		return "calculate";
	}

}
