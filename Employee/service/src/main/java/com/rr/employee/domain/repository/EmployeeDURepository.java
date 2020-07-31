package com.rr.employee.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rr.employee.domain.entity.EmployeeAlias;

@Repository
public interface EmployeeDURepository extends JpaRepository<EmployeeDURepository, EmployeeAlias> {
	
	@Query("SELECT a.bay from EmployeeDU a where a.empAlias= :empAlias")
	List<String> getBaysByEmpAlias(String empAlias); 
	
	//List<String> deleteByEmp_Alias(String empAlias);
	
	@Query("DELETE a from EmployeeDU a where a.empAlias= :empAlias")
	List<String> deleteBaysByEmpAlias(String empAlias);
	}
