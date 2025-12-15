package com.xworkz.myStudio.DBConstants;

import lombok.Getter;
import lombok.Setter;


@Getter
public enum DBConstants {
    URL("jdbc:mysql://localhost:3306/library"),
    USERNAME("root"),
    PWD("tiger");
    private String s;

    DBConstants(String s)
    {
        this.s = s;
    }

}


