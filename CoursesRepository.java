package com.project.springbootstarter.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<Courses,Long>{
	
	
	public List<Courses> findByTopicId(Long topicid);

}
