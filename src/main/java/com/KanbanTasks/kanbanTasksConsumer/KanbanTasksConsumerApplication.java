package com.kanbanTasks.kanbantasksconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KanbanTasksConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KanbanTasksConsumerApplication.class, args);
	}

}
