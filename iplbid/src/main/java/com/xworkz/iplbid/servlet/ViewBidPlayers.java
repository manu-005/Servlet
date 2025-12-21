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
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/viewBidPlayers", loadOnStartup = 1)
public class ViewBidPlayers extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("view doget started");

       String cName= req.getParameter("companyName");
        System.out.println(cName);

        PlayerService playerService = new PlayerServiceImpl();
      List<PlayerBidDTO> bidPlayers = playerService.validForview(cName);
        System.out.println("servlet :"+bidPlayers);

        if ((bidPlayers == null || bidPlayers.isEmpty())){
          req.setAttribute("error","Players Not found..");
          req.getRequestDispatcher("ViewBidPlayers.jsp").forward(req,resp);
      }else{
          req.setAttribute("bidPlayers",bidPlayers);
          req.getRequestDispatcher("ViewBidPlayers.jsp").forward(req,resp);

      }
        System.out.println("view doget ended..");
    }
}
