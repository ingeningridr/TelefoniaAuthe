package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.LostCallsPort;
import com.example.springboot.telefonia.dto.CallsBody;
import com.example.springboot.telefonia.dto.LostCallsBody;


import java.util.logging.Logger;

import static com.example.springboot.telefonia.service.CallsService.LoggerFactory;

public abstract class LostCallsService<JavaLostCallsSender> implements LostCallsPort {

    private static final Logger LOGGER = LoggerFactory.getLogger(String.valueOf(LostCallsService.class));

    //@Autowired
    private JavaLostCallsSender sender;


    @Override
    public boolean sendLostCalls(LostCallsBody lostCallsBody) throws Exception {
        LOGGER.info("LostCallsBody: " + lostCallsBody.toString());
        String pathToAttachment;
        return sendLostCalls(
                lostCallsBody.getStart_name(),
                lostCallsBody.getService_name(),
                lostCallsBody.getPhone_number());
    }

    private boolean sendLostCalls(String start_name, String service_name, int phone_number) {

        return false;
    }

    private boolean sendLostCallsTool(String start_name, String service_name, String phone_number){

        boolean send = false;
        try {

            CallsBody helper = null;
            helper.setStart_name(start_name);
            helper.setService_name(service_name);
            helper.setPhone_number(Integer.parseInt(phone_number));
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }
}