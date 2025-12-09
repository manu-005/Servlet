package com.xworkz.tvSystem.constants;

public enum DbConstants {
    URL("jdbc:mysql://localhost:3306/library"),
    USERNAME("root"),
    PWD("tiger");
    private String s;

    DbConstants(String s) {
        this.s = s;
    }

    public String getS(){
        return s;
    }
}
