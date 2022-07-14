package com.example.javabrains.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {

	@Autowired
	private topicService topicservice;
	
	// if we run localhost:8080/topics , then you get all topics details.
	@RequestMapping("/topics")
	public List<topic> getAllTopics() {
		return topicservice.getAllTopics();
	}

	// if we run localhost:8080/topics/topic_id , then you get the details of particular topic.
	
	@RequestMapping("/topics/{id}")
	public topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	
	// this body for add the topic in API. This Run on postman plateform.
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody topic topica) {
		topicservice.addTopic(topica);
	}
	
}
