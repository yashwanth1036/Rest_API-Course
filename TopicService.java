package com.project.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicsRepository;
	
	private List<Topic> topics =  new ArrayList<>(Arrays.asList(
			new Topic(1L,"Spring FrameWork","Spring Framework Description"),
			new Topic(2L,"Core Java","Java Description"),
			new Topic(3L,"JavaScript","JavaScript Description")
		));

		public List<Topic> getAllTopics(){
			List<Topic> topics = new ArrayList<>();
			topicsRepository.findAll().forEach(topics::add);
		//	topicsRepository.findAll().forEach(System.out::println);
			return topics;
			}
		
		public Topic getTopicById(Long id) {
			Topic topic = topicsRepository.findOne(id);
			return topic;
			
		}

		public void addTopic(Topic topic) {
			topicsRepository.save(topic);
		}

		public void updateTopic(Long id, Topic topic) {
			topicsRepository.save(topic);
			
		}
		public void deleteTopic(Long id) {
			topicsRepository.delete(id);
			
		}

		
		
}
/// Update
/*
 * for(int i=0;i<topics.size();i++) { if(topics.get(i).getId().equals(id)) {
 * topics.set(i, topic); } }
 */
//Delete
//topics.removeIf(t-> t.getId().equals(id));