package com.xworkz.service;

import com.xworkz.dto.MatrimonyUserDTO;

public class MatrimonyValidateImpl implements MatrimonyValidateInterface{
    @Override
    public void validate(MatrimonyUserDTO matrimonyUserDTO) {

        if(matrimonyUserDTO != null){

            if(matrimonyUserDTO.getEmail() == null || matrimonyUserDTO.getEmail().length() > 8);
        }
    }
}
