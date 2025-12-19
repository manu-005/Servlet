package com.xworkz.iplbid.service;

import com.xworkz.iplbid.dto.CompanyDTO;
import com.xworkz.iplbid.dto.PlayerBiddingDTO;
import com.xworkz.iplbid.dto.PlayerDTO;
import com.xworkz.iplbid.servlet.PlayerBiddingServlet;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    boolean valid(PlayerDTO playerDTO);

    Optional<CompanyDTO> getCompanyName(CompanyDTO companyDTO);

    List<PlayerDTO> getBiddingPlayer(PlayerBiddingDTO playerBiddingDTO);


}
