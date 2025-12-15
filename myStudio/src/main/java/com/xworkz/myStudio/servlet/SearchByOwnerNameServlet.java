package com.xworkz.myStudio.servlet;

import com.xworkz.myStudio.dto.EventDTO;
import com.xworkz.myStudio.dto.SearchOwnerNameDTO;
import com.xworkz.myStudio.service.EventService;
import com.xworkz.myStudio.service.EventServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/owner",loadOnStartup = 1)
public class SearchByOwnerNameServlet extends HttpServlet {


   public  SearchByOwnerNameServlet(){
        System.out.println("created by search");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

     String oName  =req.getParameter("oName");

        System.out.println(oName);

        SearchOwnerNameDTO searchOwnerNameDTO = new SearchOwnerNameDTO(oName);
        System.out.println("call service");
        EventService eventService = new EventServiceImpl();
       Optional<EventDTO>  fetched =eventService.searchOwner(searchOwnerNameDTO);

        System.out.println(fetched);
        System.out.println("return service");
       if (fetched.isPresent()){

           req.setAttribute("dto",fetched);
           req.getRequestDispatcher("SearchByOwnerResult.jsp").forward(req,resp);
       }else{
           req.setAttribute("error","not exist");
           req.getRequestDispatcher("SearchByOwnerResult.jsp").forward(req,resp);
       }

    }
}
