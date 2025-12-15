package com.xworkz.myStudio.dao;

import com.xworkz.myStudio.DBConstants.DBConstants;
import com.xworkz.myStudio.dto.EventDTO;
import com.xworkz.myStudio.dto.SearchOwnerNameDTO;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class EventDAOImpl implements EventDAO {


    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean save(EventDTO eventDTO) {


        String sql = "insert into studio(eventName,date,days,ownerName,mobile) values(?,?,?,?,?); ";

        boolean saved = false;

        try (Connection connection = DriverManager.getConnection(DBConstants.URL.getS(), DBConstants.USERNAME.getS(), DBConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, eventDTO.getEventName());
            statement.setString(2, eventDTO.getDate());
            statement.setInt(3, eventDTO.getDays());
            statement.setString(4, eventDTO.getOwnerName());
            statement.setLong(5, eventDTO.getMobile());

            int rows = statement.executeUpdate();
            System.out.println(rows);

            if (rows == 1) {
                System.out.println("inserted ..");
                saved = true;
            } else {
                System.out.println("not saved ..");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (saved) {
            return saved;
        } else {
            return saved;
        }
    }

    @SneakyThrows
    @Override
    public Optional<EventDTO> searchByOwner(SearchOwnerNameDTO searchOwnerNameDTO) {

        String sql = "select * from studio where ownerName=?;";


        try (Connection connection = DriverManager.getConnection(DBConstants.URL.getS(), DBConstants.USERNAME.getS(), DBConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, searchOwnerNameDTO.getOName());

            ResultSet set = statement.executeQuery();

            System.out.println(set);
            System.out.println("result set occured");
            if (set.next()) {

                String event = set.getString(2);
                String date = set.getString(3);
                int days = set.getInt(4);
                String ownerName = set.getString(5);
                long mobile = set.getLong(6);

                System.out.println(event);

                EventDTO eventDTO = new EventDTO(event, date, days, ownerName, mobile);
                System.out.println(eventDTO);
                return Optional.of(eventDTO);

            }
                return Optional.empty();


        }

    }
}
