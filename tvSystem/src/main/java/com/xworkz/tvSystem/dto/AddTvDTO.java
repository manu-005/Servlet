package com.xworkz.tvSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class AddTvDTO implements   Comparable{

    private int id;
    private String name;
    private String brand;
    private double size;
    private Boolean avail;
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
