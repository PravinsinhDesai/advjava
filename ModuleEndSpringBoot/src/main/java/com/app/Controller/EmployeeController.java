package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.EmployeeService;
import com.app.pojos.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empserv;
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp) {
		return empserv.addNewEmp(emp);	
	}
	
	@GetMapping
	public List<Employee> getAllEmps(){
		return empserv.getAllEmps();
	}
	
	@DeleteMapping("/{id}")
	
	public void deleteEmployee(@PathVariable Long id ) {
		System.out.println("Id"+id);
		empserv.deleteEmp(id);
	}
	
	@PutMapping
	public Employee updateEmp(@RequestBody Employee emp) {
		return empserv.updateEmp(emp);
	}
}
