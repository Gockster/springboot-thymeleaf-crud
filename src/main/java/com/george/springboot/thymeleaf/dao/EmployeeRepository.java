package com.george.springboot.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.george.springboot.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
