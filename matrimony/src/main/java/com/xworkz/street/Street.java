package com.xworkz.street;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Street {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/workforxwork";
        String userName = "root";
        String pwd =  "tiger";
        Connection connection = DriverManager.getConnection(url,userName,pwd);
        System.out.println("connection :"+connection);

        Statement statement = connection.createStatement();
        System.out.println("statement:"+statement);

        String sql = "create table if not exists street(id int primary key, attention varchar(200),buildingname varchar(200), housenumber varchar(20), streetpredirectional varchar(30), streetname varchar(30), streettype varchar(100), streetpostdirectional varchar(30), unittype varchar(20), unitnumber varchar(20), city varchar(30), postalcode varchar(30), country varchar(30))";
        String q1="insert into  street values(1,'jane deo',null,'485','N','smith','st','sw','apt','300B','chicago','60601','US')";
//        ResultSet rs=statement.executeQuery(q1);
        int rowAffected = statement.executeUpdate(sql);
        System.out.println("Row affected :"+rowAffected);
        rowAffected = statement.executeUpdate(q1);
        System.out.println("Row affected :"+rowAffected);

    }
}
