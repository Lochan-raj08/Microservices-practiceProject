package com.atom.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atom.user.entity.User;
import com.atom.user.repo.UserRepo;
import com.atom.user.vo.Department;
import com.atom.user.vo.ResponseTemplateVO;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long uId) {
		ResponseTemplateVO vo = new ResponseTemplateVO(); 
		User user = userRepo.findByuId(uId);
	
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getdId(), Department.class); 
	
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
}
