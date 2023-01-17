package com.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_id")
	private int deptId;
	private String dept_Name;
	private String dept_Hod;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDept_Name() {
		return dept_Name;
	}
	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}
	public String getDept_Hod() {
		return dept_Hod;
	}
	public void setDept_Hod(String dept_Hod) {
		this.dept_Hod = dept_Hod;
	}
	
	



}
