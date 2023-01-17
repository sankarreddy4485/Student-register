package com.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repository.DeptRepository;
import com.department.request.CreateDeptRequest;
import com.department.response.CreateDeptResponse;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);
	
	@Autowired
	DeptRepository deptRepository;
	@Override
	public CreateDeptResponse createDepartment(CreateDeptRequest createDeptRequest) {
		
		Department department = new Department();
		department.setDeptId(createDeptRequest.getDeptId());
		department.setDept_Name(createDeptRequest.getDept_Name());
		department.setDept_Hod(createDeptRequest.getDept_Hod());
		deptRepository.save(department);
		return new CreateDeptResponse(department);
	}

	@Override
	public CreateDeptResponse getById(int dept_id) {

		Department department = deptRepository.findById(dept_id).get();
		return new CreateDeptResponse(department);
	}

}
