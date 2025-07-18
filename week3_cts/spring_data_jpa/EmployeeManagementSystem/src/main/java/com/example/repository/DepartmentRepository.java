package com.example.repository;



import com.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Derived query method: find department by name
    Department findByName(String name);
}

