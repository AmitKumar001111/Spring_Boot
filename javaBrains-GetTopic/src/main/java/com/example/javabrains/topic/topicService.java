package com.example.javabrains.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicService {

	 private List <topic> topics = Arrays.asList(
				new topic("spring", "spring Framework", "spring Framework Description"),
				new topic("java", "core java", "core java description"),
				new topic("javascript", "javaScript", "java script description")
				);

	public List<topic> getAllTopics() {
		return topics;
	}

	public topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
