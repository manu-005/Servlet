package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class MatrimonyUserDTO implements Comparable{


    private String email;
    private String gender;
    private String dob;
    private String motherTongue;
    private String religion;
    private String martialStatus;
    private int height;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
