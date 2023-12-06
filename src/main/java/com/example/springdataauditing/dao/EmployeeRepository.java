package com.example.springdataauditing.dao;

import com.example.springdataauditing.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
