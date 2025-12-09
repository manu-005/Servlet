package com.xworkz.tvSystem.service;

import com.xworkz.tvSystem.dto.AddTvDTO;

public class ServiceImpl implements ServiceInterface {
    @Override
    public boolean validateTvAndSave(AddTvDTO addTvDTO) {
        boolean valid=false;
        if(addTvDTO !=null ) {

            if (addTvDTO.getId() <= 0) {
                System.out.println("id is invalid");
            } else if (addTvDTO.getName().trim().isEmpty()) {
                System.out.println("name is invalid");
            } else if (addTvDTO.getBrand().trim().isEmpty()) {
                System.out.println("brand is invalid");
            } else if (addTvDTO.getSize() <= 0) {
                System.out.println("size is invalid");
            } else {
                System.out.println("validation done and send to dao..");
                valid = true;


            }
        }
        return valid;
    }
}
