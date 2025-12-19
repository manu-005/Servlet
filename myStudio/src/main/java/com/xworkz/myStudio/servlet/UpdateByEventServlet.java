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
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/update", loadOnStartup = 1)
public class UpdateByEventServlet extends HttpServlet {

    public UpdateByEventServlet(){
        System.out.println("Update by event Servlet object created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String event  =req.getParameter("event");

        System.out.println(event);

        SearchOwnerNameDTO searchOwnerNameDTO = new SearchOwnerNameDTO();
        searchOwnerNameDTO.setEvent(event);
        System.out.println("call service");

        EventService eventService = new EventServiceImpl();
        List<EventDTO> fetched =eventService.updateByEvent(searchOwnerNameDTO);

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
