package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/school",loadOnStartup = 1
)
public class SchoolDetailsServlet extends GenericServlet {

    public SchoolDetailsServlet(){
        System.out.println("School Details Servlet Object Created..");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

       String name= servletRequest.getParameter("name");
        String yop= servletRequest.getParameter("yop");
        String percentage= servletRequest.getParameter("percentage");

        System.out.println(name);
        System.out.println(yop);
        System.out.println(percentage);
        System.out.println("----------------");

    }
}
