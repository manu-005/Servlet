package com.xworkz.constants;

public enum BookConstants {

    URL("jdbc:mysql://localhost:3306/library"),
    USERNAME("root"),
    PWD("tiger");

    private String s;

    BookConstants(String s) {
        this.s = s;
    }

   public String getS(){
        return s;
    }
}
