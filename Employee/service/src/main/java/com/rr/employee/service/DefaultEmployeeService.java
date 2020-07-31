package com.rr.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rr.employee.domain.dto.CreateEmpRequestDTO;
import com.rr.employee.domain.dto.CreateEmpResponseDTO;
import com.rr.employee.domain.dto.EmployeeDTO;
import com.rr.employee.domain.entity.Employee;
import com.rr.employee.domain.repository.EmployeeDURepository;
import com.rr.employee.domain.repository.EmployeeRepository;

@Service
public class DefaultEmployeeService implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	private final EmployeeDURepository employeeDURepository;
	// private final EmployeeMapper employeeMapper;

	@Autowired
	public DefaultEmployeeService(EmployeeRepository employeeRepository, EmployeeDURepository employeeDURepository) {
		this.employeeRepository = employeeRepository;
		this.employeeDURepository = employeeDURepository;

//		this.employeeMapper = employeeMapper;
	}

	@Override
	@Transactional
	public CreateEmpResponseDTO createEmployee(CreateEmpRequestDTO createEmpRequestDTO) {

		// Employee emp = employeeMapper.toEntity(createEmpRequestDTO);

		Employee emp = new Employee();
		emp.setEmpUserName(createEmpRequestDTO.getEmpUserName());// Taking from request dto and setting to Entity
		emp.setEmpName(createEmpRequestDTO.getEmpName());
		/* Alias will be saving in lowercase - System generated */
		emp.setEmpAlias(createEmpRequestDTO.getEmpUserName().toLowerCase());

		/* Delete existing bays for this employee */
		try {
			employeeDURepository.deleteBaysByEmpAlias(empAlias);
		} catch (DataAccessException e) {
			e.getMessage();
		}

		/* save new list of Bays */
		saveBays(createEmpRequestDTO.getCurrentBayAccess(), emp.getEmpAlias());
		employeeRepository.save(emp);

		CreateEmpResponseDTO empRes = new CreateEmpResponseDTO();
		// empRes.setEmpName(createEmpRequestDTO.getEmpName());
		return empRes;
	}

	private void saveBays(List<String> bays, String empAlias) {
		List<String> listbays = null;
		/*
		 * List<Employee> employeeList= findEmployeeByEmpAlias(empAlias); ToDo: mapper-
		 * Employee to EmployeeDU mapper List<EmployeeDU> employeeDUList =
		 * mapper.fromEmployeeToEmployeeDU(employeeList);
		 * employeeDUList.forEach(employeeDU ->{ employeeDU.setBay() })
		 */

	}

	/*
	 * private List<com.rr.employee.domain.entity.EmployeeDU>
	 * fromEmployeeToEmployeeDU (List<Employee> listbay){
	 * 
	 * //listbay Check ignored for bravity
	 * 
	 * List<com.rr.employee.domain.entity.EmployeeDU> list =new
	 * ArrayList<>(listbay.size());
	 * 
	 * for (Employee employee:listbay) { list.add(fromEmployeeToEmployeeDU) } }
	 */
}
