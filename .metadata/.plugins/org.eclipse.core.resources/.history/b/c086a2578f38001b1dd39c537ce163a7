package com.atom.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atom.department.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

	Department findBydId(Long dId);
	
}
