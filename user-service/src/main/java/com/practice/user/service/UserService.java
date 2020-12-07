package com.practice.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.user.entity.User;
import com.practice.user.repo.UserRepository;
import com.practice.user.vo.Department;
import com.practice.user.vo.ResponseTemplateVO;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO(); 
		User user = userRepository.findByuserId(userId);
	
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepId(), Department.class); 
	
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
}
