package com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

import com.example.springboot.telefonia.dto.CallsBody;

public interface CallsPort {

    boolean CallsPort(CallsPort callsPort) throws Exception;

    boolean sendCalls(CallsBody callsBody) throws Exception;
}

