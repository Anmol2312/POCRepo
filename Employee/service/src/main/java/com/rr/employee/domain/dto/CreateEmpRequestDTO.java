package com.rr.employee.domain.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEmpRequestDTO {

	private String empUserName;
	private String empName;
	private String empDU;
	private String empAddress;

	private List<String> currentBayAccess;
}
