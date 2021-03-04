//package com.example.demo.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.websocket.Session;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.example.demo.model.Employee;
//import com.example.demo.repository.WebapiRepository;
//
//@Controller
//public class Webcontroller {
//	
//	@Autowired
//	WebapiRepository repo;
//	
//	@RequestMapping(value="/test")
//	public String test()
//	{
//		return "test";
//		
//	}
//	
//	@PostMapping(value="/addemp")
//	public Employee addemployee(@RequestBody Employee emp)
//	{
//		repo.save(emp);
//		return emp;
//	}
//	 
//	@GetMapping("/getall")
//	public List<Employee> employees()
//	{
//		return (List<Employee>) repo.findAll();
//		
//	}
//	
//	@GetMapping("/employees/{name}")
//	public List<Employee> findbyname(@PathVariable("name") String name)
//	{
//		return repo.findByName(name);
//	}
//
//	@DeleteMapping("/employee/{id}")
//	public ResponseEntity<Object> delete(@PathVariable("id") int id)
//	{
//		if(repo.findById(id)!=null)
//		{
//			repo.deleteById(id);
//			return new ResponseEntity<>("deleted successfully",HttpStatus.OK);
//		}
//		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}
//
//	@PutMapping("/empupdate")
//	public Employee updateemp(@RequestBody Employee emp)
//	{
//		repo.save(emp);
//		return emp;
//	}
//	
//	// writing the apis for web
//	@GetMapping("/")
//	public String employeesList(Model model)
//	{
//		List<Employee> emplist=(List<Employee>) repo.findAll();
//		model.addAttribute("emplist", emplist);
//		return "index";
//		
//	}
//	@GetMapping("/new")
//	public String newformforaddingemployee(Model model)
//	{
//		Employee emp=new Employee();
//		model.addAttribute("employee", emp);
//		return "newemp";
//		
//	}
//	@PostMapping(value="post")
//	public String addemployees(Employee emp)
//	{
//		repo.save(emp);
//		return "redirect:/";
//	}
//	@RequestMapping("/edit/{id}")
//	public ModelAndView findbyid(@PathVariable("id") int id)
//	{
//		ModelAndView mv=new ModelAndView("edit_emp");
//		Employee emp=repo.findById(id).orElse(null);
//		mv.addObject("employee", emp);
//		return mv;
//	}
//	@RequestMapping("/delete/{id}")
//	public String deleteemp(@PathVariable("id") int id)
//	{
//		repo.deleteById(id);
//		return "redirect:/";
//	}
//	
//	
//}
