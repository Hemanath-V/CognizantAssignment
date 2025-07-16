package com.example.controller;



import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Create an employee
    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // Read all employees
    @GetMapping
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    // Read employee by ID
    @GetMapping("/{id}")
    public Optional<Employee> getById(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

    // Update employee
    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        return employeeRepository.findById(id).map(emp -> {
            emp.setName(updatedEmployee.getName());
            emp.setEmail(updatedEmployee.getEmail());
            emp.setDepartment(updatedEmployee.getDepartment());
            return employeeRepository.save(emp);
        }).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    // Delete employee
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }
}

