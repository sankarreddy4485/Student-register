package com.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.request.CreateDeptRequest;
import com.department.response.CreateDeptResponse;
import com.department.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/create")
	public CreateDeptResponse createDepartment (@RequestBody CreateDeptRequest createDeptRequest) {
		return departmentService.createDepartment(createDeptRequest);
	}
	
	@GetMapping("/getById/{id}")
	public CreateDeptResponse getById(@PathVariable int id) {
		return departmentService.getById(id);
	}

}
