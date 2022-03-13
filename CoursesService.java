package com.project.springbootstarter.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {
	@Autowired
	private CoursesRepository coursesRepository;
	
			public List<Courses> getAllCourses(Long topicId){
			List<Courses> courses = new ArrayList<>();
			coursesRepository.findByTopicId(topicId).forEach(courses::add);
		//	topicsRepository.findAll().forEach(System.out::println);
			return courses;
			}
		
		public Courses getCourse(Long id) {
			Courses course = coursesRepository.findOne(id);
			return course;
			
		}

		public void addCourse(Courses course) {
			coursesRepository.save(course);
		}

		public void updateCourse(Courses course) {
			coursesRepository.save(course);
			
		}
		public void deleteCourse(Long id) {
			coursesRepository.delete(id);
			
		}

		
		
}
/// Update
/*
 * for(int i=0;i<topics.size();i++) { if(topics.get(i).getId().equals(id)) {
 * topics.set(i, topic); } }
 */
//Delete
//topics.removeIf(t-> t.getId().equals(id));