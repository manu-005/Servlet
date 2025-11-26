package com.xworkz.survey.dao;

import com.xworkz.survey.dto.SurveyDTO;

public class SurveyDAOImpl implements SurveyDAOInterface{

   public SurveyDAOImpl(){
        System.out.println("Survey DAO object created..");
    }
    @Override
    public void saveData(SurveyDTO surveyDTO) {


        System.out.println("data svae successfully....");
    }
}
