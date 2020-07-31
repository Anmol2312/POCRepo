package com.rr.employee.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.rr.employee.constants.EmployeeConstants;
import com.rr.employee.domain.dto.CreateEmpRequestDTO;
import com.rr.employee.domain.dto.CreateEmpResponseDTO;

@RequestMapping(EmployeeConstants.ApiPath.BASE_PATH)
public interface EmployeeApi {

	@PostMapping(value = EmployeeConstants.ApiPath.EMPLOYEE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,consumes =org.springframework.http.MediaType.APPLICATION_JSON_VALUE )
	@ResponseStatus(HttpStatus.CREATED)
	ResponseEntity<CreateEmpResponseDTO> CreateEmployee(@Valid @RequestBody CreateEmpRequestDTO createEmpRequestDTO);

}
