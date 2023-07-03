package com.example.demo.controller;
import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/employees")
	public class EmployeeController {
	    private final EmployeeRepository employeeRepository;

	    @Autowired
	    public EmployeeController(EmployeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }

	    @GetMapping
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    @PostMapping
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    

	    @PutMapping("/{id}")
	    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeData) {
	        Employee employee = employeeRepository.findById(id).orElse(null);
	        if (employee != null) {
	            employee.setName(employeeData.getName());
	            employee.setAddress(employeeData.getAddress());
	            employee.setOccupation(employeeData.getOccupation());
	            employee.setHobby(employeeData.getHobby());
	            employee.setGender(employeeData.getGender());
	            return employeeRepository.save(employee);
	        }
	        return null;
	    }

	    @DeleteMapping("/{id}")
	    public void deleteEmployee(@PathVariable Long id) {
	        employeeRepository.deleteById(id);
	    }
	}


