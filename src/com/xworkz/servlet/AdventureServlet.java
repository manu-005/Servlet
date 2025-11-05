package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/adventure", loadOnStartup = 1)
public class AdventureServlet extends GenericServlet {

    public AdventureServlet(){
        System.out.println("Adventure Servlet Object Created ");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Adventure Servlet Service method called");

      String name =   servletRequest.getParameter("name");

        String from =   servletRequest.getParameter("from");

        String to =   servletRequest.getParameter("to");

        String days =   servletRequest.getParameter("days");

        String members =   servletRequest.getParameter("members");
        System.out.println(name);
        System.out.println(from);
        System.out.println(to);
        System.out.println(days);
        System.out.println(members);
        System.out.println("------------------------");





    }
}
