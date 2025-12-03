package com.xworkz.sweet;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Sweet {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/workforxwork";
        String userName = "root";
        String pwd =  "tiger";
        Connection connection = DriverManager.getConnection(url,userName,pwd);
        System.out.println("connection :"+connection);

        Statement statement = connection.createStatement();
        System.out.println("statement:"+statement);

        String sql = "create table if not exists sweet(id int primary key, name varchar(50),quantity int, type varchar(20) ,price int, ingredient varchar(40), datemade DATE)";
        String q1="insert into  sweet(id,name,quantity, type,price,ingredient,datemade) values(1,'mysorepak',7,'spicy sweet', 70,'sugar water','2025-11-11')";
//        ResultSet rs=statement.executeQuery(q1);
        int rowAffected = statement.executeUpdate(sql);
        System.out.println("Row affected :"+rowAffected);
        rowAffected = statement.executeUpdate(q1);
        System.out.println("Row affected :"+rowAffected);



        q1="insert into  sweet(id,name,quantity, type,price,ingredient,datemade) values(2,'jamoon',10,'sweet', 20,'sugar, powder water','2025-11-11')";
        rowAffected = statement.executeUpdate(q1);
        System.out.println("Row affected :"+rowAffected);


        q1="insert into  sweet(id,name,quantity, type,price,ingredient,datemade) values(3,'sweet bun',10,'sweet', 15,'sugar, powder water','2025-11-11')";
        rowAffected = statement.executeUpdate(q1);
        System.out.println("Row affected :"+rowAffected);

    }
}
