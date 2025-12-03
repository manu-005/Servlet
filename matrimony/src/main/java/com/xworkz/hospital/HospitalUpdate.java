package com.xworkz.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HospitalUpdate {

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(HospitalEnum.URL.getS(),HospitalEnum.USERNAME.getS(),HospitalEnum.PWD.getS());
           Statement statement = connection.createStatement()){
//            String sql = "create table hospital(id int primary key, firstname varchar(20), lastname varchar(20), dob DATE ,gender varchar(30), address varchar(50), phonenumber varchar(50), email varchar(50),admission date)";
//            String q1 = " insert into hospital (id,firstname,lastname,dob,nationality,state,phone,email,doj) values\n" +

                    String q1 = "update table hospital set firstname='Manoj' where id= 5";

           int rowAffected = statement.executeUpdate(q1);
            System.out.println("rows Afffected :"+rowAffected);
        }

        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
