package com.example.MicroServiceExample1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MicroServiceExample1.Entity.Employee;
import com.example.MicroServiceExample1.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	public EmployeeRepository employeerepo;
	
	
	public Employee save(Employee employee) {
		
		return employeerepo.save(employee);
		
	}
	public List<Employee> saveEmployees(List<Employee> employee)
	{
		return employeerepo.saveAll(employee);
		 
	}
	public List<Employee> getAllEmployee(){
		
		 return employeerepo.findAll();
	}
	public Employee getEmployeebyId(int id) {
		return employeerepo.findById(id).orElse(null);
	}
	public String deleteById(int id) {
		  employeerepo.deleteById(id);
		  return "record deleted";
	}
	public String deleteAll() {
		  employeerepo.deleteAll();
		  return "record deleted";
	}

}
