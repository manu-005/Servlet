package com.xworkz.jspChaining.service;

import com.xworkz.jspChaining.dto.CoffeeDTO;
import com.xworkz.jspChaining.validateException.ValidException;

public interface CoffeeInterface {

    public void validateDetails(CoffeeDTO coffeeDTO) throws ValidException;
}
