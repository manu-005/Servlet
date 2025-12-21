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

//        int battingAvg = 0;
//        int bowlingAvg = 0;
//        int stumps = 0;

        String type = req.getParameter("playerType");
        System.out.println(type);

        int battingAvg = Integer.parseInt(req.getParameter("battingAvg"));
        System.out.println(battingAvg);

        int bowlingAvg = Integer.parseInt(req.getParameter("bowlingAvg"));
        System.out.println(bowlingAvg);

        int stumps = Integer.parseInt(req.getParameter("stumps"));
        System.out.println(stumps);
//        if (bat !=null || !bat.isEmpty()){
//            battingAvg=Integer.parseInt(bat);
//        }
//        System.out.println(battingAvg);
//
//        if (bowl !=null || !bowl.isEmpty()){
//            bowlingAvg=Integer.parseInt(bowl);
//        }
//        if (stp !=null || !stp.isEmpty()){
//            stumps=Integer.parseInt(stp);
//        }

        PlayerBiddingDTO playerBiddingDTO = new PlayerBiddingDTO(type,battingAvg,bowlingAvg,stumps);
        System.out.println(playerBiddingDTO);

        PlayerService playerService = new PlayerServiceImpl();

       List<PlayerDTO> players = playerService.getBiddingPlayer(playerBiddingDTO);

        System.out.println(players);

        if ((players == null || players.isEmpty())){
                req.getSession().setAttribute("error","Players not available..!");
                req.getRequestDispatcher("SearchPlayer.jsp").forward(req,resp);
            }else{
            req.setAttribute("player",players);
            req.getRequestDispatcher("PlayersDetails.jsp").forward(req,resp);
        }

        System.out.println("player bidding ended");
    }
}
