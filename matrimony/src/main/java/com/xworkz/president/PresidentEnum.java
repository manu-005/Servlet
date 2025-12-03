package com.xworkz.president;

public enum PresidentEnum implements AutoCloseable {


    URL("jdbc:mysql://localhost:3306/workforxwork"),USERNAME("root"),PWD("tiger");
    private String s;
    PresidentEnum(String s){
        this.s=s;
    }

    public String getS(){
        return s;
    }

    @Override
    public void close() throws Exception {
        System.out.println("President connection closed");
    }
}
