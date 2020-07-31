package com.rr.employee.domain.entity;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

//Consumer class

@Data
@Entity
@Table(name = "employee_project")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "empId")
public class EmployeeProject {

	@EmbeddedId
	private EmployeeAlias employeeDuId;

	@Column(name = "emp_proj_name")
	private String empProjName;

	@CreationTimestamp
	@Column(name = "created_datetime")
	private OffsetDateTime createdDate;
}
