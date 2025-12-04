package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class BookDTO implements Comparable {

    private String bName;
    private String aName;
    private int price;
    private int noOfCopies;


    private boolean available;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
