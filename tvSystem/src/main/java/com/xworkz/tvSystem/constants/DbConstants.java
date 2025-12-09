package com.xworkz.tvSystem.constants;

public enum DbConstants {
    URL("jdbc:mysql://localhost:3306/library"),
    USERNAME("root"),

    PWD("tiger");
    String s;

    DbConstants(String s) {
        this.s = s;
    }

    String get(String s) {
        return s;
    }
}
