package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/mdegree",loadOnStartup = 1)
public class MasterDegreeDetailsServlet extends GenericServlet {



    public MasterDegreeDetailsServlet(){
        System.out.println("Master Degree Details Servlet object created..");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name= servletRequest.getParameter("name");
        String cname= servletRequest.getParameter("cname");
        String yop= servletRequest.getParameter("yop");
        String percentage= servletRequest.getParameter("percentage");
        String stream= servletRequest.getParameter("stream");

        System.out.println(name);
        System.out.println(cname);
        System.out.println(yop);
        System.out.println(percentage);
        System.out.println(stream);
        System.out.println("----------------");

    }
}
