package com.example.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class topicService {

	@Autowired
	private TopicRepository topicRepository;
	// change here for add any topic  : new ArrayList<>().
//	 private List <topic> topics = new ArrayList<>(Arrays.asList(
//				new topic("spring", "spring Framework", "spring Framework Description"),
//				new topic("java", "core java", "core java description"),
//				new topic("javascript", "javaScript", "java script description")
//				));

	 // this method for get all the topics after connecting the data.
	public List<topic> getAllTopics() {
		//return topics;
		List<topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}

	// this method for get a particular topic by id after connect to the data.
	public Optional<topic> getTopic(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}

	// this method for add a topic after connect the data.
	public void addTopic(topic topica) {
		topicRepository.save(topica);
		
	}

	// this method for update a topic after connecting the data.
	public void updateTopic(String id, topic topica) {
//		for(int i=0; i<topics.size(); i++) {
//			topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topica);
//				return;
//			}
//		}
		topicRepository.save(topica);
		
	}

	// this method for delete a topic after connecting the data.
	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
		
	}
}
