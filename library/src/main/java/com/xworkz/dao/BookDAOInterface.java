package com.xworkz.dao;

import com.xworkz.dto.BookDTO;

import java.util.Optional;

public interface BookDAOInterface {

     void saveBookData(BookDTO bookDTO);
    Optional<BookDTO> bNameExist(BookDTO bookDTO);
}
