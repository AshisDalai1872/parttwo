package com.example.MicroServiceExample1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MicroServiceExample1.Entity.Employee;
import com.example.MicroServiceExample1.Repository.EmployeeRepository;
import com.example.MicroServiceExample1.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	
	@GetMapping("/Home")
	public String Home() {
		
		return "welcome to homepage Ashis";
	}
	
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeByid(@PathVariable int id)
	{
		return employeeService.getEmployeebyId(id);
		
		
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
		
		
	}
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	
	}
	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(List<Employee> employes) {
		return employeeService.saveEmployees(employes);
	
	}

}
