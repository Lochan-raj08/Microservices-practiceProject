package com.atom.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.atom.department.entity.Department;
import com.atom.department.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;

	public Department saveDepartment(Department department) {
		
		System.out.println("Inside saveDepartment service");
		return departmentRepo.save(department);
	}

	public Department findDepartmentById(Long dId) {
		System.out.println("Inside findDepartmentById controller");
		return departmentRepo.findBydId(dId);
	}
}
