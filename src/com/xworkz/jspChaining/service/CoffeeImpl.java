package com.xworkz.jspChaining.service;

import com.xworkz.jspChaining.dto.CoffeeDTO;
import com.xworkz.jspChaining.validateException.ValidException;

public class CoffeeImpl implements CoffeeInterface{
    @Override
    public void validateDetails(CoffeeDTO coffeeDTO) throws ValidException{
        System.out.println(coffeeDTO);

        String type  = coffeeDTO.getType();


        if(coffeeDTO != null){

            if (type != null && type.length() > 2){


            }else{
                System.out.println("not valid type");

                throw new ValidException("in valid");
        }





    }}
}
