package com.project.springbootstarter.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.springbootstarter.topic.Topic;

@RestController
public class CoursesController {
	
	@Autowired
	private CoursesService courseService;
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Courses> getAllCourses(@PathVariable Long topicId) {
		return courseService.getAllCourses(topicId);
	}
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Courses getCourse(@PathVariable Long id) {
		return courseService.getCourse(id);
	}
	@RequestMapping(method = RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Courses course, @PathVariable Long topicId) {
		course.setTopic(new Topic(topicId, "" , ""));  
		courseService.addCourse(course); 
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Courses course,@PathVariable Long topicId,@PathVariable Long id) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/topics/{topicId}/courses{id}")
	public void deleteCourse(@PathVariable Long id) {
		courseService.deleteCourse(id);
	}
	
}
