package com.rr.employee.domain.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

//Producer class
@Data
@Entity
@Table(name = "employee_du")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "empId")
public class EmployeeDU implements Serializable {
	private static final long serialVersionUID = 103605580827226752L;

	@EmbeddedId
	private EmployeeAlias employeeDuId;

	@Column(name = "emp_du_name")
	private String empDuName;

	@CreationTimestamp
	@Column(name = "created_datetime")
	private OffsetDateTime createdDate;
	
	@Column(name = "bay")
	private String bay;
	
	@Column(name = "access_status")
	private String status;
	
}
