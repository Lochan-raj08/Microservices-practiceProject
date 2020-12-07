package com.atom.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atom.user.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	User findByuId(Long uId);

}
