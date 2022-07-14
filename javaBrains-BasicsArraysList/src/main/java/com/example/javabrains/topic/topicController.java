package com.example.javabrains.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {

	@RequestMapping("/topics")
	public List<topic> getAllTopics() {
		return  Arrays.asList(
				new topic("spring", "spring Framework", "spring Framework Description"),
				new topic("java", "core java", "core java description"),
				new topic("javascript", "javaScript", "java script description")
				);
	}

}
