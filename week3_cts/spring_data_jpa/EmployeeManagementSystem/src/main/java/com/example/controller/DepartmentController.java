package com.example.controller;



import com.example.entity.Department;
import com.example.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Create a department
    @PostMapping
    public Department create(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    // Read all departments
    @GetMapping
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    // Read department by ID
    @GetMapping("/{id}")
    public Optional<Department> getById(@PathVariable Long id) {
        return departmentRepository.findById(id);
    }

    // Update department
    @PutMapping("/{id}")
    public Department update(@PathVariable Long id, @RequestBody Department updatedDepartment) {
        return departmentRepository.findById(id).map(dep -> {
            dep.setName(updatedDepartment.getName());
            return departmentRepository.save(dep);
        }).orElseThrow(() -> new RuntimeException("Department not found"));
    }

    // Delete department
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        departmentRepository.deleteById(id);
    }
}

