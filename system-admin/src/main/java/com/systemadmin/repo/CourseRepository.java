package com.systemadmin.repo;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.systemadmin.model.CourseDetails;



@Repository
public interface CourseRepository extends MongoRepository<CourseDetails, String> {
  
//	  List<CourseDetails> findByStudentId(String studentId);
}
