package com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

import com.example.springboot.telefonia.dto.LostCallsBody;

public interface LostCallsPort{

    boolean LostCallsPort(LostCallsPort lostCallsPort) throws Exception;

    boolean sendLostCalls(LostCallsPort LostCallsBody) throws Exception;

    boolean sendLostCalls(LostCallsBody lostCallsBody) throws Exception;
}
