package com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

import com.example.springboot.telefonia.dto.QueueTimeBody;

public interface QueueTimePort {

    boolean QueueTimePort(QueueTimePort queueTimePort) throws Exception;

    boolean sendQueueTime(QueueTimePort queueTimeBody) throws Exception;

    boolean sendQueueTimeTool(QueueTimeBody queueTimeBody);
}

