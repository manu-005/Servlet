package com.xworkz.iplbid.dao;

import com.xworkz.iplbid.constants.DbConstants;
import com.xworkz.iplbid.dto.CompanyDTO;
import com.xworkz.iplbid.dto.PlayerBiddingDTO;
import com.xworkz.iplbid.dto.PlayerDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayerDAOImpl implements PlayerDAO {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean save(PlayerDTO playerDTO) {
        boolean saved = true;

        String q = " insert into player(name,age,playerType,state,battingAvg,bowlingAvg,stumps) values(?,?,?,?,?,?,?);";


        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getS(), DbConstants.USERNAME.getS(), DbConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(q)) {

            System.out.println("connection started..");

            statement.setString(1, playerDTO.getName());
            statement.setInt(2, playerDTO.getAge());
            statement.setString(3, playerDTO.getPlayerType());
            statement.setString(4, playerDTO.getState());
            statement.setInt(5, playerDTO.getBattingAvg());
            statement.setInt(6, playerDTO.getBowlingAvg());
            statement.setInt(7, playerDTO.getStumps());

            int rows = statement.executeUpdate();

            System.out.println("rows :" + rows);
            if (rows == 1) {
                System.out.println("saved in DB successfully..");
            } else {
                saved = false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return saved;
    }

    @Override
    public Optional<CompanyDTO> getCompanyname(CompanyDTO companyDTO) {
        System.out.println("dao started");


        String q = "select * from company where emailId=?;";

        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getS(), DbConstants.USERNAME.getS(), DbConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(q)) {

            System.out.println("connection started..");

            statement.setString(1, companyDTO.getEmailId());
            ResultSet set = statement.executeQuery();


            if (set.next()) {

                String email = set.getString(1);
                String companyName = set.getString(2);

                CompanyDTO companyDTO1 = new CompanyDTO(email, companyName);
                return Optional.of(companyDTO1);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        System.out.println("dao ended");
        return Optional.empty();
    }

    @Override
    public List<PlayerDTO> getBiddingPlayer(PlayerBiddingDTO playerBiddingDTO) {
        System.out.println("player bidding dao started");

        String sql =" select * from player where playerType=? and battingAvg >=? and bowlingAvg >=? and stumps >=?; ";
        List<PlayerDTO> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getS(), DbConstants.USERNAME.getS(), DbConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(sql)) {

            System.out.println("connection started..");

            statement.setString(1, playerBiddingDTO.getType());
            statement.setString(2, playerBiddingDTO.getAvg());
            statement.setString(3, playerBiddingDTO.getAvg());
            statement.setString(4, playerBiddingDTO.getAvg());

            ResultSet set = statement.executeQuery();

            while (set.next()) {

                String name = set.getString(1);
                int age = set.getInt(2);

                String type = set.getString(3);
                String state = set.getString(4);

                int battingAvg = set.getInt(5);
                int bowlingAvg = set.getInt(6);
                int stumps = set.getInt(7);


                PlayerDTO playerDTO = new PlayerDTO(name,age,type, state,battingAvg,bowlingAvg,stumps);
                 list.add(playerDTO);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (!list.isEmpty()){
            return list;
        }else {
            System.out.println("player bidding dao ended");
            return null;
        }
    }

}
