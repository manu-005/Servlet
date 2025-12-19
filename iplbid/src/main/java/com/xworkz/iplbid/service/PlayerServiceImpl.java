package com.xworkz.iplbid.service;

import com.xworkz.iplbid.dao.PlayerDAO;
import com.xworkz.iplbid.dao.PlayerDAOImpl;
import com.xworkz.iplbid.dto.CompanyDTO;
import com.xworkz.iplbid.dto.PlayerBiddingDTO;
import com.xworkz.iplbid.dto.PlayerDTO;

import java.util.List;
import java.util.Optional;

public class PlayerServiceImpl implements PlayerService {
    @Override
    public boolean valid(PlayerDTO playerDTO) {
        boolean validAndSave = true;

        if (playerDTO != null) {

            if (playerDTO.getName().trim().isEmpty()) {
                validAndSave = false;
            } else if (playerDTO.getAge() <= 15) {
                validAndSave = false;
            } else if (playerDTO.getPlayerType().trim().isEmpty()) {
                validAndSave = false;
            } else if (playerDTO.getState().trim().isEmpty()) {
                validAndSave = false;
            } else if (playerDTO.getBattingAvg() < 0) {
                validAndSave = false;
            } else if (playerDTO.getBowlingAvg() < 0) {
                validAndSave = false;
            } else if (playerDTO.getStumps() < 0) {
                validAndSave = false;
            }
        }

        if (validAndSave) {
            PlayerDAO playerDAO = new PlayerDAOImpl();
            boolean saved = playerDAO.save(playerDTO);
            if (!saved) {
                validAndSave = false;
            }

        }
        return validAndSave;
    }

    @Override
    public Optional<CompanyDTO> getCompanyName(CompanyDTO companyDTO) {

        System.out.println("get company name started");

        PlayerDAO playerDAO = new PlayerDAOImpl();

        Optional<CompanyDTO> getCompany = playerDAO.getCompanyname(companyDTO);

        if (getCompany.isPresent()) {
            return getCompany;
        } else {

            System.out.println("get company ended");
            return Optional.empty();
        }
    }

    @Override
    public List<PlayerDTO> getBiddingPlayer(PlayerBiddingDTO playerBiddingDTO) {

        System.out.println("player bidding service started");

        PlayerDAO playerDAO = new PlayerDAOImpl();

        List<PlayerDTO> players = playerDAO.getBiddingPlayer(playerBiddingDTO);
        System.out.println(players);

        if (!players.isEmpty()) {
            return players;
        } else {

            System.out.println("player bidding service ended");
            return null;
        }
    }

}
