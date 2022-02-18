package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.CallsPort;
import com.example.springboot.telefonia.dto.CallsBody;
import com.example.springboot.telefonia.response.Calls;

import java.util.logging.Logger;

public abstract class CallsService<JavaCallsSender> implements CallsPort {

    public static Logger LoggerFactory;
    private static final Logger LOGGER = LoggerFactory.getLogger(String.valueOf(CallsService.class));

        //@Autowired
        private JavaCallsSender sender;

        @Override
        public boolean sendCalls(CallsBody callsBody) throws Exception {
            LOGGER.info("CallsBody: " + callsBody.toString());
            String pathToAttachment;
            return sendCalls(
                    callsBody.getStart_name(),
                    callsBody.getService_name(),
                    callsBody.getPhone_number());
        }

    private boolean sendCalls(String start_name, String service_name, int phone_number) {
        return false;
    }

    private boolean sendCallsTool(String start_name, String service_name, String phone_number){

            boolean send = false;
            try {
                Calls helper = null;
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
