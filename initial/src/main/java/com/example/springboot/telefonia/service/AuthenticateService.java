package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.AuthenticatePort;
import com.example.springboot.telefonia.dto.AuthenticateBody;

import java.util.logging.Logger;

import static com.example.springboot.telefonia.service.CallsService.LoggerFactory;


public abstract class AuthenticateService<JavaAuthenticateSender> implements AuthenticatePort {

    private static final Logger LOGGER = LoggerFactory.getLogger(String.valueOf(AuthenticateService.class));

   // @Autowired
    private JavaAuthenticateSender sender;

    @Override
    public boolean sendAuthenticate(AuthenticateBody authenticateBody) throws Exception {

        LOGGER.info("AuthenticateBody: " + authenticateBody.toString());
            String pathToAttachment;
        return sendAuthenticate(
                    authenticateBody.getKey(),
                    authenticateBody.getToken());
        }

    private boolean sendAuthenticate(String key, String token) {
    return false;
    }

    private boolean sendAuthenticateTool(String key, String token){

        boolean send = false;
        try {
            AuthenticateBody helper = null;
            helper.setKey(key);
            helper.setToken(token);
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }

}