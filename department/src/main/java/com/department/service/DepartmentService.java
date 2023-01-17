package com.department.service;

import com.department.request.CreateDeptRequest;
import com.department.response.CreateDeptResponse;

public interface DepartmentService {
		
	CreateDeptResponse createDepartment(CreateDeptRequest createDeptRequest);
	CreateDeptResponse getById (int id);

}
