package com.xworkz.service;

import com.xworkz.dto.BookDTO;

public class BookValidateImpl implements BookValidateInterface {
    @Override
    public boolean validate(BookDTO bookDTO) {
        boolean invalid = false;
        if (bookDTO != null) {

            if (bookDTO.getBName() == null || bookDTO.getBName().length() <= 2) {
                System.out.println("book Name is invalid..");
//                invalid = true;
            } else if (bookDTO.getAName() == null || bookDTO.getAName().length() <= 2) {
                System.out.println("author name is invalid..");
//                invalid = true;
            } else if (bookDTO.getPrice() <= 49) {
                System.out.println("book price should be greater than 49 rupees..");
//                invalid = true;
            } else if (bookDTO.getNoOfCopies() <= 1) {
                System.out.println("no of copies must be greater then 1..");
//                invalid = true;
            }else{
                System.out.println("successfully validated..");
                invalid = true;
            }

        }
        return invalid;
    }
}



