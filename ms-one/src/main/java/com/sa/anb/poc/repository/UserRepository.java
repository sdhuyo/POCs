package com.sa.anb.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.anb.poc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
