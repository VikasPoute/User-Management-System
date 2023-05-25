package com.spring.boot.usermng.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.usermng.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
