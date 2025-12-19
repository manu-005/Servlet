package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.PlayerDTO;
import com.xworkz.iplbid.service.PlayerService;
import com.xworkz.iplbid.service.PlayerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addPlayer" , loadOnStartup =1)
public class PlayerServlet extends HttpServlet {
     public PlayerServlet(){
         System.out.println("player servlet object created");
     }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("player do post started");

        resp.setContentType("text/html");

      String name =  req.getParameter("name");
       int age = Integer.parseInt(req.getParameter("age"));
        System.out.println(age);
        String playerType =  req.getParameter("playerType");
        System.out.println(playerType);
        String state =  req.getParameter("state");
        System.out.println(state);
        int battingAvg = Integer.parseInt(req.getParameter("battingAvg"));
        System.out.println(battingAvg);

        int bowlingAvg = Integer.parseInt(req.getParameter("bowlingAvg"));
        System.out.println(bowlingAvg);

        int stumps = Integer.parseInt(req.getParameter("stumps"));
        System.out.println(stumps);
        PlayerDTO playerDTO = new PlayerDTO(name,age,playerType,state,battingAvg,bowlingAvg,stumps);

        System.out.println(playerDTO);

        PlayerService playerService = new PlayerServiceImpl();

        boolean validAndSave = playerService.valid(playerDTO);

        System.out.println("---servlet"+validAndSave);

        if (validAndSave){

            req.setAttribute(name,"name");

            req.setAttribute("success","Successfully Added Player.!");
            req.getRequestDispatcher("Saved.jsp").forward(req,resp);

        }else{

            req.setAttribute("error","Unable to Add Player..!");

            req.getRequestDispatcher("NotSaved.jsp").forward(req,resp);

        }


        System.out.println("player do post ended");
    }
}
