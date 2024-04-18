package com.example.EmailService.consumers;

import com.example.EmailService.dtos.SendEmailMessageDto;
import org.springframework.kafka.annotation.KafkaListener;

public class SendEmailConsumer {
    @KafkaListener(
            id = "smailServiceConsumerGroup" ,
            topics = {"sendEmail"}
    )
    public void handleSendEmail(SendEmailMessageDto messageDto){
        System.out.println("Got the send email message!");
    }
}
