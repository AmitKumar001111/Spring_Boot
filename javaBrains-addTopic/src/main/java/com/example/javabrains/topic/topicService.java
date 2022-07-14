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

	public List<topic> getAllTopics() {
		return topics;
	}

	public topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(topic topica) {
		topics.add(topica);
		
	}
}
