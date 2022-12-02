package com.systemmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;

import com.systemmanagement.payload.response.JwtResponses;

public interface ResponseRepository extends MongoRepository<JwtResponses, String> {

}
