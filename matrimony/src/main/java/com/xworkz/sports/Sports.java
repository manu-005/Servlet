package com.xworkz.sports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sports {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/workforxwork";
        String userName = "root";
        String pwd =  "tiger";
        Connection connection = DriverManager.getConnection(url,userName,pwd);
        System.out.println("connection :"+connection);

        Statement statement = connection.createStatement();
        System.out.println("statement:"+statement);

        String sql = "create table if not exists sport(id int primary key, firstname varchar(20),lastname varchar(20), dob DATE ,nationality varchar(20), sport varchar(30), event varchar(30), coachid int, personalbest varchar(50), medalswon int default 0)";
        String q1="insert into  sport(id,firstname, lastname,dob,nationality,sport,event,coachid,personalbest,medalswon) values(2,'ram','kumar','2002-11-10','indian','kabbaddi','mens kabbaddi' , 12,'raider',2)";
//        ResultSet rs=statement.executeQuery(q1);
        int rowAffected = statement.executeUpdate(sql);
        System.out.println("Row affected :"+rowAffected);
        rowAffected = statement.executeUpdate(q1);
        System.out.println("Row affected :"+rowAffected);

    }
}
