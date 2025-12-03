package com.xworkz.dao;

import com.xworkz.dto.BookDTO;

public class BookDAOImpl implements BookDAOInterface{
    @Override
    public void saveBookData(BookDTO bookDTO) {
        System.out.println("Save Method started...");


        System.out.println("Book Data Saved successfuly..");
    }
}
