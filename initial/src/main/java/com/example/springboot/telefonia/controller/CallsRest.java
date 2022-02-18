package com.example.springboot.telefonia.controller;

import com.example.springboot.telefonia.Interface.CallsPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class CallsRest {

    @Autowired
    private CallsPort callsPort;

    @PostMapping(value = "/calls")
    public String sendCallsRest(
    @RequestParam("calls") String calls,
    @RequestParam("dini") Date DIni,
    @RequestParam("dfin") Date DFin,
    @RequestParam("service") String Service,
    @RequestParam("calls") String Calls,
    @RequestParam("start_name") String Start_name,
    @RequestParam("service_name") String Service_name,
    @RequestParam("phone_number") String Phone_number) {

        return "dini " +DIni+ "dfin " + DFin + "service" +Service+ "calls" + Calls + "start_name" + Start_name + "service_name" + Service_name + "phone_number" + Phone_number +"";

    }
}