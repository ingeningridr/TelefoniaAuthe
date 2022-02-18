package com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

import com.example.springboot.telefonia.dto.AuthenticateBody;

public interface AuthenticatePort {


    boolean AuthenticatePort(AuthenticatePort authenticatePort) throws Exception;

    boolean sendAuthenticate(AuthenticateBody authenticateBody) throws Exception;
}

