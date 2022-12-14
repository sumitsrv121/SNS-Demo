package com.srv.sumit.snsdemo.service;

import io.awspring.cloud.messaging.core.NotificationMessagingTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SnsServiceImpl implements SnsService{
    private final NotificationMessagingTemplate messagingTemplate;

    public void sendSnsMessage(String topic, Object message, String subject) {
        log.info("Writing message {} to topic {}", message, topic);

        messagingTemplate.sendNotification(topic, message, subject);
    }
}
