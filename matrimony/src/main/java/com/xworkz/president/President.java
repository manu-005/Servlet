package com.xworkz.president;

import java.sql.*;

public class President {
    public static void main(String[] args)  {

        try( Connection connection = DriverManager.getConnection(PresidentEnum.URL.getS(),PresidentEnum.USERNAME.getS(),PresidentEnum.PWD.getS());
             Statement statement = connection.createStatement()) {

//            String sql = "create table president(id int primary key, firstname varchar(20), middlename varchar(30),lastname varchar(20), dob DATE ,nationality varchar(20), homeState varchar(30), placeOfBirth varchar(40), politicalParty varchar(30), termStart date, termedDate date, isActive boolean, vicePresident varchar(50), bioLink varchar(50))";
         //   String q1="insert into  president values(1,'ram','kumar','sharma','2002-11-10','indian','karnataka','kariyamma hospital' , 'mariyappa united front', '2024-05-01','2025-01-01',true,'basappa' , 'link sikkilla')";
//            String q1="insert into  president values(2,'Omprasad','shetty','shetree','1999-10-12','indian','Andra Pradesh','govt hospital' , ' my party', '2025-12-01','2025-11-30',true,'barath' , 'myData')" +
//          "insert into  president values(3,'manohar','ananda','doctree','1994-10-12','indian','madhya Pradesh','bglr' , ' ur party', '2023-12-01','2025-01-30',false,'tan' , 'idontknow')";

            String q2 ="insert into president values(11,'Arun','Kumar','Shetty','1990-04-15','indian','Karnataka','Udupi','Janatha Party','2024-01-10','2025-01-01',true,'Ramesh','arunBio')" +
                            "insert into president values(12,'Megha','Ramesh','Pai','1993-07-02','indian','Kerala','Kochi','People First','2023-02-15','2024-12-30',false,'Divya','meghaBio')" +
                            "insert into president values(13,'Rohit','Manjunath','Hegde','1989-11-02','indian','Goa','Panaji','National Unity','2024-05-20','2025-03-12',true,'Sujith','rohitBio')" +
                            "insert into president values(14,'Kavya','Suresh','Naik','1995-09-18','indian','Maharashtra','Pune','Future India','2023-08-01','2025-02-28',false,'Anita','kavyaBio')" +
                            "insert into president values(15,'Yash','Harish','Gowda','1992-12-09','indian','Tamil Nadu','Chennai','Reform Party','2024-03-15','2025-04-10',true,'Lokesh','yashBio')";


            int rowAffected = statement.executeUpdate(q2);
            System.out.println("Row affected :"+rowAffected);
//
//            int rowAffected = statement.executeUpdate(q1);
//            System.out.println("Row affected :"+rowAffected);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
