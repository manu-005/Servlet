package com.xworkz.hospital;

public enum HospitalEnum {

    URL("jdbc:mysql://localhost:3306/workforxwork"),
    USERNAME("root"),PWD("tiger");

    private String s;
    HospitalEnum(String s) {
        this.s=s;
        System.out.println("enum constructor..");
    }

    public String getS(){
        return s;
    }
}
