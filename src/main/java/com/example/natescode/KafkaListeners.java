package com.example.natescode;

import com.example.natescode.models.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "natescode", groupId = "groupId", containerFactory = "messageFactory")
    void listener(Message data) {
        System.out.println("Listener received: " + data);
    }
}
