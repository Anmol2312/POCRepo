package com.rr.employee.domain.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "empId")
public class Employee implements Serializable {

	private static final long serialVersionUID = 8277087141980181913L;

	@Id
	@Column(name = "emp_id")
	@Type(type = "uuid-char")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID empID;

	@NotNull
	@Column(name = "emp_name")
	private String empName;
	
	@NotNull
	@Column(name = "emp_user_name")
	private String empUserName;

	@Column(name = "emp_alias")
	private String empAlias;
	
	@CreationTimestamp
	@Column(name = "created_datetime")
	private OffsetDateTime createdDate;
}
