package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.PlayerBiddingDTO;
import com.xworkz.iplbid.dto.PlayerDTO;
import com.xworkz.iplbid.service.PlayerService;
import com.xworkz.iplbid.service.PlayerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/searchPlayer",loadOnStartup = 1)
public class PlayerBiddingServlet extends HttpServlet {

    public PlayerBiddingServlet() {
        System.out.println("player bidding  object created..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("player bidding started.");

        String type = req.getParameter("playerType");
        String avg = req.getParameter("avgValue");

        PlayerBiddingDTO playerBiddingDTO = new PlayerBiddingDTO(type,avg);
        System.out.println(playerBiddingDTO);

        PlayerService playerService = new PlayerServiceImpl();

       List<PlayerDTO> players = playerService.getBiddingPlayer(playerBiddingDTO);

        System.out.println(players);

        if (players.isEmpty()){
            req.setAttribute("error","Players not available..!");
            req.getRequestDispatcher("SearchPlayer.jsp").forward(req,resp);
        }else{
            req.setAttribute("player",players);
            req.getRequestDispatcher("PlayersDetails.jsp").forward(req,resp);
        }


        System.out.println("player bidding ended");
    }
}
