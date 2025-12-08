package com.xworkz.dao;

import com.xworkz.dto.BookDTO;

import java.util.Optional;

public interface BookDAOInterface {

     boolean saveBookData(BookDTO bookDTO);

    boolean bNameExist(BookDTO bookDTO) ;


}
