package com.example.repository;


import com.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    List<Employee> findByDepartmentName(String departmentName);

    // Derived query method: find employee by email
    Employee findByEmail(String email);
}

