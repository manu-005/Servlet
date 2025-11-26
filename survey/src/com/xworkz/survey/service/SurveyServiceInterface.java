package com.xworkz.survey.service;

import com.xworkz.survey.dto.SurveyDTO;
import com.xworkz.survey.exception.SurveyValidException;

public interface SurveyServiceInterface {

    public void validate(SurveyDTO surveyDTO) throws SurveyValidException;
}
