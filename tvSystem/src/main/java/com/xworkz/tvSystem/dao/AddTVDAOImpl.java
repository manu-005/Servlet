package com.xworkz.tvSystem.dao;

import com.xworkz.tvSystem.constants.DbConstants;
import com.xworkz.tvSystem.dto.AddTvDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddTVDAOImpl implements AddTVDAOInterface {
    @Override
    public boolean save(AddTvDTO addTvDTO) {
        boolean saved = false;

        String q = "insert into tv (name,brand,size,avail)values(?,?,?,?);";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getS(), DbConstants.USERNAME.getS(), DbConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(q)) {

            System.out.println("connection started..");
            statement.setString(1, addTvDTO.getName());
            statement.setString(2, addTvDTO.getBrand());
            statement.setDouble(3, addTvDTO.getSize());
            statement.setBoolean(4, addTvDTO.getAvail());

            int rows = statement.executeUpdate();
            System.out.println("rows :" + rows);
            if (rows == 1) {
                System.out.println("saved in DB successfully..");
                saved = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return saved;
    }
}
