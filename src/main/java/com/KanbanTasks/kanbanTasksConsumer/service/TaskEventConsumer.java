package com.kanbanTasks.kanbantasksconsumer.service;


import com.kanbanTasks.events.TaskEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TaskEventConsumer {

    @KafkaListener(topics = "task-events", groupId = "kanban-consumer-group")
    public void consume(TaskEvent event) {
        log.info("[CONSUMER] Received task event: id={}, title={}, status={}, priority={}, tag={}",
                event.getId(), event.getTitle(), event.getStatus(), event.getPriority(), event.getTag());
    }
}
