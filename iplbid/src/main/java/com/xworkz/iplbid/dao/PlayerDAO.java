package com.xworkz.iplbid.dao;

import com.xworkz.iplbid.dto.CompanyDTO;
import com.xworkz.iplbid.dto.PlayerBidDTO;
import com.xworkz.iplbid.dto.PlayerBiddingDTO;
import com.xworkz.iplbid.dto.PlayerDTO;

import java.util.List;
import java.util.Optional;

public interface PlayerDAO {

    boolean save(PlayerDTO playerDTO);

    Optional<CompanyDTO> getCompanyname(CompanyDTO companyDTO);

List<PlayerDTO> getBiddingPlayer(PlayerBiddingDTO playerBiddingDTO);

    boolean storeBid(PlayerBidDTO playerBidDTO);

    List<PlayerBidDTO> getBidView(String s);
}
