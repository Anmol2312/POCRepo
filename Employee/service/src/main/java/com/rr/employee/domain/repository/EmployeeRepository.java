package com.rr.employee.domain.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rr.employee.domain.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID>{

}
