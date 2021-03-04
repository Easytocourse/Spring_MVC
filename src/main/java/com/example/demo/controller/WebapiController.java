package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.repository.WebapiRepository;

@Controller
public class WebapiController {
	
	@Autowired
	WebapiRepository repo;
	
	@RequestMapping("/")
	@ResponseBody
	public List<Employee> indexpage(Model model)
	{
		List<Employee> emp=(List<Employee>) repo.findAll();
		//model.addAttribute("emplist", emp); 
		//return "index";
		return emp;
		  
	}

	
	@RequestMapping("/new")
	public String newformforemployee(Model model)
	{
		Employee emp=new Employee();
		model.addAttribute("employee", emp);
		return "new_emp";
	}
	
	@PostMapping(value="add")
	public String addemployee(Employee emp)
	{
		repo.save(emp);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editform(@PathVariable("id")int id)
	{
		ModelAndView mv=new ModelAndView("edit_emp");
		Employee emp= repo.findById(id).orElse(null);
		mv.addObject("employee", emp);
		return mv;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteemp(@PathVariable("id")int id)
	{
		repo.deleteById(id);
		return "redirect:/";
	}
}
