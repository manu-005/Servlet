package com.xworkz.cafeteria.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CafeteriaDTO implements Serializable,Comparable {

    private String cName;
    private String loc;
    private String type;
    private String price;
    private String fName;
    private String oName;
    private String gstNo;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
