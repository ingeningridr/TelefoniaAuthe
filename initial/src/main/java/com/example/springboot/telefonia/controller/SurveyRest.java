package com.example.springboot.telefonia.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class SurveyRest {

    @PostMapping(value = "/survey")
    @ResponseBody
    public String sendSurveyRest(
    @RequestParam("survey") String Survey,
    @RequestParam("dini") Date DIni,
    @RequestParam("dfin") Date DFin,
    @RequestParam("service") String Service,
    @RequestParam("start_name") String Start_name,
    @RequestParam("service_name") String Service_name,
    @RequestParam("phone_number") String Phone_number,
    @RequestParam("fcr") String Fcr,
    @RequestParam("nps") String Nps,
    @RequestParam("cs") String Cs,
    @RequestParam("p1") String P1,
    @RequestParam("p2") String P2,
    @RequestParam("p3") String P3,
    @RequestParam("p4") String P4,
    @RequestParam("p5") String P5,
    @RequestParam("p6") String P6,
    @RequestParam("p7") String P7,
    @RequestParam("p8") String P8,
    @RequestParam("p9") String P9) {

        return "Dini " +DIni+ "DFin " + DFin + "service" +Service+ "survey" + Survey +
        "start_name " +Start_name+ "Service_name " + Service_name + "Phone_number"+Phone_number+"fcr" +Fcr+ "nps" + Nps +
        "cs " +Cs+ "p1 " + P1 + "p2" +P2+ "p3" + P3 + "p4 " +P4+ "p5 " + P5 + "p6" +P6+ "p7" + P7 + "p8" +P8+ "p9" + P9 +"";

    }

}

