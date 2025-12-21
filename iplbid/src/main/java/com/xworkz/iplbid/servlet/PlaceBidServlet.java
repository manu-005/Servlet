package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.PlayerBidDTO;
import com.xworkz.iplbid.service.PlayerService;
import com.xworkz.iplbid.service.PlayerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/placeBid",loadOnStartup = 1)
public class PlaceBidServlet extends HttpServlet {
    public PlaceBidServlet()
    {
        System.out.println("place big servlet object created ");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("place bid started post");

      String playerName= req.getParameter("playerName");
      String companyName= req.getParameter("companyName");
      double bidAmount = Double.parseDouble(req.getParameter("bidAmount"));

        PlayerBidDTO playerBidDTO = new PlayerBidDTO(playerName,companyName,bidAmount);

        PlayerService playerService = new PlayerServiceImpl();

      boolean  bidSaved =  playerService.validService(playerBidDTO);
if (bidSaved){
    req.setAttribute("success","Bid saved Successfully..");
    req.getRequestDispatcher("PlayerBidStatus.jsp").forward(req,resp);

}else{
    req.setAttribute("error","Not allowed for bid..");
    req.getRequestDispatcher("PlayerBidStatus.jsp").forward(req,resp);

}
    System.out.println("place bid ended post");

    }
}
