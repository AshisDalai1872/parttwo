package com.example.MicroServiceExample1.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MicroServiceExample1.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
