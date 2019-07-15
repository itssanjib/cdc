package com.gl.cdcproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.cdcproducer.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping(path = "/employee/{id}")
	public Employee getEmployeeDetails() {
		return new Employee("0001", "Sanjib Pal", 38);
	}

}
