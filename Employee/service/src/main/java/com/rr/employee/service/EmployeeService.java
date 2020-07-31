package com.rr.employee.service;

import com.rr.employee.domain.dto.CreateEmpRequestDTO;
import com.rr.employee.domain.dto.CreateEmpResponseDTO;

public interface EmployeeService {

	CreateEmpResponseDTO createEmployee(CreateEmpRequestDTO createEmpRequestDTO);
}
