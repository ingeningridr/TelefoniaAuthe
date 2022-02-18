package com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

import com.example.springboot.telefonia.dto.HandlingTimeBody;

public interface HandlingTimePort {

    boolean HandlingTimePort(HandlingTimePort handlingTimePort) throws Exception;

    boolean HandlingTimeBody(HandlingTimeBody handlingTimeBody) throws Exception;

    boolean sendHandlingTime(HandlingTimeBody handlingTimeBody) throws Exception;
}




