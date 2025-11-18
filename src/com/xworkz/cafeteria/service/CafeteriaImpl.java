package com.xworkz.cafeteria.service;

import com.xworkz.cafeteria.dto.CafeteriaDTO;

public class CafeteriaImpl implements CafeteriaInterface{


    @Override
    public void validateDTO(CafeteriaDTO cafeteriaDTO) {
        System.out.println(cafeteriaDTO);
    }
}
