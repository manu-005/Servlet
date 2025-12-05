package com.xworkz.dao;

import com.xworkz.dto.BookDTO;

public interface BookDAOInterface {

     void saveBookData(BookDTO bookDTO);
    boolean bNameExist(BookDTO bookDTO);
}
