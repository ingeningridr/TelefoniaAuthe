package com.example.springboot.telefonia.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class QueueTimeRest {

    @PostMapping(value = "/queueTime")
    @ResponseBody
    public String sendQueueTimeRest(
    @RequestParam("queueTime") String queueTime,
    @RequestParam("dini") Date DIni,
    @RequestParam("dfin") Date DFin,
    @RequestParam("service") String Service,
    @RequestParam("queueTime") String QueueTime,
    @RequestParam("start_name") String Start_name,
    @RequestParam("service_name") String Service_name,
    @RequestParam("num_calls_queued") String Num_calls_queued,
    @RequestParam("total_time_queued") String Total_time_queued,
    @RequestParam("average_time_queued") String Average_time_queued,
    @RequestParam("abandonment_time_queued") String Abandonment_time_queued,
    @RequestParam("num_calls_queued_abandoned") String Num_calls_queued_abandoned,
    @RequestParam("answer_time_queued") String Answer_time_queued,
    @RequestParam("num_calls_queued_answered") String Num_calls_queued_answered) {

        return "Dini " +DIni+ "DFin " + DFin + "service" +Service+ "queueTime" + QueueTime +
        "start_name " +Start_name+ "Service_name " + Service_name + "num_calls_queued" +Num_calls_queued+ "total_time_queued" + Total_time_queued +
        "average_time_queued " +Average_time_queued+ "abandonment_time_queued " + Abandonment_time_queued + "num_calls_queued_abandoned" +Num_calls_queued_abandoned+
        "answer_time_queued" + Answer_time_queued +"num_calls_queued_answered" + Num_calls_queued_answered +"";

    }

}

