package com.srv.sumit.snsdemo.service;

public interface SnsService {
    void sendSnsMessage(String topic, Object message, String subject);
}
