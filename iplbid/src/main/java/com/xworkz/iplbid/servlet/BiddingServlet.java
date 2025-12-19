package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.CompanyDTO;
import com.xworkz.iplbid.service.PlayerService;
import com.xworkz.iplbid.service.PlayerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/startBidding", loadOnStartup = 1)
public class BiddingServlet extends HttpServlet {

    public BiddingServlet(){
        System.out.println("bidding  object created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do get started");

       String email = req.getParameter("companyEmail");

        CompanyDTO companyDTO = new CompanyDTO(email);

        System.out.println(companyDTO);

        PlayerService playerService = new PlayerServiceImpl();

       Optional<CompanyDTO> cmp = playerService.getCompanyName(companyDTO);
        System.out.println(cmp);

        if (cmp.isPresent())
        {


            req.getSession().setAttribute("cmp",cmp.get());
           req.getRequestDispatcher("SearchPlayer.jsp").forward(req,resp);
        }
        req.setAttribute("error","This e-mail is not exist");
        req.getRequestDispatcher("bidding.jsp").forward(req,resp);

        System.out.println("do get ended");
    }
}
