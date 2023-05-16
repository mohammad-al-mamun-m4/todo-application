package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.model.Test;
import com.example.demo.service.TestService;



@Controller
public class TestController {
	
	@Autowired
	private TestService testServ;
	
	///////////// Display the list of to-do Application
	@GetMapping("/")
	public String homeView(Model m) {
		m.addAttribute("listTest", testServ.getAllTestTodo());
		
		return "index.html";
	}
	
	/////////// Show add to-do list form here//////
	@GetMapping("/showAddFrom")
	public String newToDoForm(Model m) {
		Test test = new Test();
		m.addAttribute("test",test);
		
		return "addFrom.html";
		
	}
	
	
	
	/////// Save to-do data in Database///////////////
	
	@PostMapping("/saveToDo")
	public String saveTest(@ModelAttribute("test") Test test) {
		testServ.saveTest(test);
		return "redirect:/";
		
	}
	
	/////// To-Do update here /////////////
	@GetMapping("/updateToDo/{id}")
	public String toDoUpdateForm(@PathVariable("id")Integer id, Model m) {
		Test test = testServ.getTestById(id);
		m.addAttribute("test",test);
		return "updateFrom.html";
		
	}
	
	 /////////// delete to-do data//////////
	@GetMapping("/deleteTodo/{id}")
	public String deleteTodo(@PathVariable("id") Integer id) {
		this.testServ.deleteTest(id);
		
		return "redirect:/";
		
	}

}
