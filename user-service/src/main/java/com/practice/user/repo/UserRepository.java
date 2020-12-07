package com.practice.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByuserId(Long userId);

}
