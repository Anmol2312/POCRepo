package com.rr.employee.domain.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Embeddable
public class EmployeeAlias implements Serializable {

	// empUserName is like Alias
	private static final long serialVersionUID = -283473677819609893L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	private Employee employee;

	@NotNull
	@Column(name = "emp_alias")
	private String empAlias;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getEmpAlias() {
		return empAlias;
	}

	public void setEmpAlias(String empAlias) {
		this.empAlias = empAlias;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empAlias, employee);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeAlias other = (EmployeeAlias) obj;
		return Objects.equals(empAlias, other.empAlias) && Objects.equals(employee, other.employee);
	}
	
	
}
