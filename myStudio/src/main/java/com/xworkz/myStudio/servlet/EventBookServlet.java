package com.xworkz.myStudio.servlet;

import com.xworkz.myStudio.dto.EventDTO;
import com.xworkz.myStudio.service.EventService;
import com.xworkz.myStudio.service.EventServiceImpl;
import lombok.ToString;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
@ToString
@WebServlet(urlPatterns = "/bookEvent", loadOnStartup = 1)
public class EventBookServlet extends HttpServlet {

public EventBookServlet(){
    System.out.println("Event Book servlet object created...");
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("dopost started..");

        resp.setContentType("text/html");

       String name = req.getParameter("eName");
        String date = req.getParameter("eDate");
        int days = Integer.parseInt(req.getParameter("days"));
        String oName = req.getParameter("oName");
        long mobile = Long.parseLong(req.getParameter("mobileNo"));

        EventDTO eventDTO = new EventDTO(name,date,days,oName,mobile);
        System.out.println(eventDTO);

        EventService eventService= new EventServiceImpl();
       boolean checked = eventService.checkAndSave(eventDTO);

       if (checked){
           System.out.println("checked and saved...");

           req.setAttribute("name",name);
           req.setAttribute("date",date);
           req.setAttribute("days",days);
           req.setAttribute("oName",oName);
           req.setAttribute("mobile",mobile);

           req.setAttribute("success","Sussceefully stored..");
           req.getRequestDispatcher("EventBookResult.jsp").forward(req,resp);

       }else{

           req.setAttribute("error","not stored..");
           req.getRequestDispatcher("EventBookResult.jsp").forward(req,resp);

       }


        System.out.println("do post ended..");
    }


}
