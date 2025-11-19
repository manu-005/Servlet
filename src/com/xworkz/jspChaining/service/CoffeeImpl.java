package com.xworkz.jspChaining.service;

import com.xworkz.jspChaining.dto.CoffeeDTO;

public class CoffeeImpl implements CoffeeInterface{
    @Override
    public void validateDetails(CoffeeDTO coffeeDTO) {
        System.out.println(coffeeDTO);
    }
}
