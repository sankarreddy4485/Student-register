package com.department.response;

import com.department.entity.Department;

public class CreateDeptResponse {

	
	private int deptId;
	private String dept_Name;
	private String dept_Hod;
	
	
	public CreateDeptResponse(Department department) {

		this.deptId=department.getDeptId();
		this.dept_Name=department.getDept_Name();
		this.dept_Hod=department.getDept_Hod();
	}
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
