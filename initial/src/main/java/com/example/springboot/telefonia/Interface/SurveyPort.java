package com.example.springboot.telefonia.Interface;

//import javax.calls.MessagingException;

import com.example.springboot.telefonia.dto.SurveyBody;

public interface SurveyPort {

    boolean SurveyPort(SurveyPort surveyPort) throws Exception;

    boolean sendSurvey(SurveyPort SurveyBody) throws Exception;

    boolean sendSurveyTool(SurveyBody SurveyBody) throws Exception;
}