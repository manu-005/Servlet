package com.xworkz.iplbid.service;

import com.xworkz.iplbid.dao.PlayerDAO;
import com.xworkz.iplbid.dao.PlayerDAOImpl;
import com.xworkz.iplbid.dto.CompanyDTO;
import com.xworkz.iplbid.dto.PlayerBidDTO;
import com.xworkz.iplbid.dto.PlayerBiddingDTO;
import com.xworkz.iplbid.dto.PlayerDTO;

import java.util.Collections;
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
        boolean valid = true;

        System.out.println("player bidding service started");

        if (playerBiddingDTO != null) {

            if (playerBiddingDTO.getType().trim().isEmpty()) {
                valid = false;
            } else if (playerBiddingDTO.getBattingAvg() < 0) {
                valid = false;
            } else if (playerBiddingDTO.getBowlingAvg() < 0) {
                valid = false;
            } else if (playerBiddingDTO.getStumps() < 0) {
                valid = false;
            }
        }
        if (valid) {
            PlayerDAO playerDAO = new PlayerDAOImpl();
            List<PlayerDTO> players = playerDAO.getBiddingPlayer(playerBiddingDTO);
            System.out.println(players);

            if (!players.isEmpty()) {
                return players;
            } else {

                System.out.println("player bidding service ended");
                return null;
            }
        } else {
            return null;
        }

    }

    @Override
    public boolean validService(PlayerBidDTO playerBidDTO) {
        System.out.println("valid service started");
boolean valid=true;

if (!(playerBidDTO.getBidAmount() > 0)){
    valid=false;
}
if (valid){
//    daocall
    PlayerDAO  playerDAO = new PlayerDAOImpl();
    boolean stored= playerDAO.storeBid(playerBidDTO);
   if (!stored){
       valid=false;
   }
}else{
    valid=false;
}
        System.out.println("valid ended");
        return valid;
    }

    @Override
    public List<PlayerBidDTO> validForview(String s) {
        System.out.println("view service started");

        if (!s.isEmpty()) {

            PlayerDAO playerDAO = new PlayerDAOImpl();
          List<PlayerBidDTO> view =  playerDAO.getBidView(s.trim());
            System.out.println("service view :"+view);
          return  view;
        }
            System.out.println("view service ended");
        return Collections.emptyList();
    }}