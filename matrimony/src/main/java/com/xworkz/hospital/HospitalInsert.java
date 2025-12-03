package com.xworkz.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class HospitalInsert {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(HospitalEnum.URL.getS(), HospitalEnum.USERNAME.getS(), HospitalEnum.PWD.getS());
             Statement statement = connection.createStatement()) {

            //   String sql = "create table hospital(id int primary key, firstname varchar(20), lastname varchar(20), dob DATE ,gender varchar(30), address varchar(50), phonenumber varchar(50), email varchar(50),admission date)";

            String q1 = " insert into hospital (id,firstname,lastname,dob,gender,address,phonenumber,email,admission) values\n" +
                    "(1,'Ram','Kumar','2002-11-10','male','bangalore','9807654321','ramkumar@gmailcom','2024-05-01'),\n" +
                    "(2,'Asha','Shetty','1999-04-12','female','mangalore','9845012349','ashashetty@gmailcom','2024-07-14'),\n" +
                    "(3,'Raju','king','2007-01-10','male','haveri','7898765678','raju@gmailcom','2024-06-09'),\n" +
              "(4,'Ashok','k','1998-09-12','male','chikkmangalore','8765433456','ashok@gmailcom','2024-09-16') ";

             int rowAffected = statement.executeUpdate(q1);

            System.out.println("Row affected :" + rowAffected);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
}
