package com.xworkz.dao;

import com.xworkz.constants.BookConstants;
import com.xworkz.dto.BookDTO;
import com.xworkz.exception.DataNotSavaedException;

import java.sql.*;

public class BookDAOImpl implements BookDAOInterface {


    @Override
    public void saveBookData(BookDTO bookDTO) {
        System.out.println("Save Method started...");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String sql = " insert into book(bName, aName, price, noOfCopies, isAvailable) values(?,?,?,?,?); ";

        try (Connection connection = DriverManager.getConnection(BookConstants.URL.getS(), BookConstants.USERNAME.getS(), BookConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, bookDTO.getBName());
            statement.setString(2, bookDTO.getAName());
            statement.setInt(3, bookDTO.getPrice());
            statement.setInt(4, bookDTO.getNoOfCopies());
            statement.setBoolean(5, bookDTO.isAvailable());

            int rows = statement.executeUpdate();
            System.out.println("rows :" + rows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Book Data Saved successfully..");
    }

    public boolean bNameExist(BookDTO bookDTO) {
        boolean exist = false;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String existBName = " select 1 from book where bName=?;";
        try (Connection connection = DriverManager.getConnection(BookConstants.URL.getS(), BookConstants.USERNAME.getS(), BookConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(existBName)) {

            statement.setString(1, bookDTO.getBName());
            ResultSet resultSet = statement.executeQuery();

            System.out.println("connection started");
            try {
                if (resultSet.next()) {
                    System.out.println("Already exist..");
                    exist=true;

                    System.out.println("connection ended and checked exist");
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return exist;
    }
}
