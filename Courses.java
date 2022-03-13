package com.project.springbootstarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.project.springbootstarter.topic.Topic;

@Entity(name = "Courses")
public class Courses {
	
	@Id
	private Long id;
	
	private String name,description;
	
	@ManyToOne
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Courses() {
		
	}
	public Courses(Long id, String name, String description,Long topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId,"","");
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
