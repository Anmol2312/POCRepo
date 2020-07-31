package com.rr.employee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.rr.employee.domain.dto.CreateEmpRequestDTO;
import com.rr.employee.domain.dto.CreateEmpResponseDTO;
import com.rr.employee.service.EmployeeService;

import lombok.NoArgsConstructor;

//@NoArgsConstructor
@RestController
//@Validated
public class EmployeeController implements EmployeeApi {
	
	public EmployeeController() {
		
	}

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService empService) {
		this.employeeService = empService;
	}

	@Override
	public ResponseEntity<CreateEmpResponseDTO> CreateEmployee(@Valid CreateEmpRequestDTO createEmpRequestDTO) {

		CreateEmpResponseDTO createEmpResponseDTO = employeeService.createEmployee(createEmpRequestDTO);
		return ResponseEntity.status(HttpStatus.OK).body(createEmpResponseDTO);
	}
}
