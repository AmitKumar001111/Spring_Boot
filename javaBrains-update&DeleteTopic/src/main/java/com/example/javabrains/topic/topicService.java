package com.example.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicService {

	// change here for add any topic  : new ArrayList<>().
	 private List <topic> topics = new ArrayList<>(Arrays.asList(
				new topic("spring", "spring Framework", "spring Framework Description"),
				new topic("java", "core java", "core java description"),
				new topic("javascript", "javaScript", "java script description")
				));

	 // this method for get all the topics.
	public List<topic> getAllTopics() {
		return topics;
	}

	// this method for get a particular topic.
	public topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	// this method for add a topic.
	public void addTopic(topic topica) {
		topics.add(topica);
		
	}

	// this method for update a topic.
	public void updateTopic(String id, topic topica) {
		for(int i=0; i<topics.size(); i++) {
			topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topica);
				return;
			}
		}
		
	}

	// this method for delete a topic.
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}
}
