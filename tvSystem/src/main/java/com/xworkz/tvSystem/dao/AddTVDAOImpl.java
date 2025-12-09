package com.xworkz.tvSystem.dao;

import com.xworkz.tvSystem.constants.DbConstants;
import com.xworkz.tvSystem.dto.AddTvDTO;
import com.xworkz.tvSystem.dto.SearchTVDTO;

import java.sql.*;
import java.util.Optional;

public class AddTVDAOImpl implements AddTVDAOInterface {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean save(AddTvDTO addTvDTO) {
        boolean saved = false;

        String q = "insert into tv (name,brand,size,avail)values(?,?,?,?);";


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

    @Override
    public Optional<AddTvDTO> fetchByName(SearchTVDTO searchTVDTO) {

        String fetch = " SELECT * FROM tv where name=?;";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getS(), DbConstants.USERNAME.getS(), DbConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(fetch)) {

            System.out.println("connection started..");
            statement.setString(1, searchTVDTO.getName());
            ResultSet set = statement.executeQuery();

            while(set.next()){
                System.out.println("get table data..");
                int id = set.getInt(1);
                String name =set.getString(2);
                String brand = set.getString(3);
                double size = set.getDouble(4);
                boolean avail = set.getBoolean(5);

                AddTvDTO addTvDTO = new AddTvDTO(id,name,brand,size,avail);
                System.out.println(" data send back to service..");
                return Optional.of(addTvDTO);



            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

return Optional.empty();
    }
}
