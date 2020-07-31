package com.rr.employee.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access=AccessLevel.PRIVATE)
public class EmployeeConstants {

	@NoArgsConstructor(access=AccessLevel.PRIVATE)
	public static class ApiPath{
		public static final String BASE_PATH ="/api/v1";
		
		public static final String EMPLOYEE ="/employee";
	}
}
