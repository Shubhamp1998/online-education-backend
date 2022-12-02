package com.systemmanagement.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.systemmanagement.model.Role;
import com.systemmanagement.model.RoleType;

public interface RoleRepository extends MongoRepository<Role,String> {
	Optional<Role> findByName(RoleType name);
	}
