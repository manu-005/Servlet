package com.xworkz.tvSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class SearchTVDTO implements Comparable{

    private String name;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
