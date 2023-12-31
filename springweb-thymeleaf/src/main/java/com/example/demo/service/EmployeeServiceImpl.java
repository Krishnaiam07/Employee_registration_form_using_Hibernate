package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();     
	}
	 @Override 
	  public void saveEmployee(Employee employee) {
	 
	  this.employeeRepository.save(employee);
	 
	     
	 
	  } 
	 
	 
	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional=employeeRepository.findById(id);    
		Employee employee=null; 
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new RuntimeException("Employee not found for id:: "+id);   
		}
		
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
         this.employeeRepository.deleteById(id);		
	}



}
