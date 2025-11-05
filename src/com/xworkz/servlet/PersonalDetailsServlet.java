package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/personal" , loadOnStartup = 1)
public class PersonalDetailsServlet extends GenericServlet {

    public PersonalDetailsServlet(){
        System.out.println("Personal Details Servlet object created..");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String no = servletRequest.getParameter("no");
        String age = servletRequest.getParameter("age");
        String address = servletRequest.getParameter("address");
        String gender = servletRequest.getParameter("gender");
        String dob = servletRequest.getParameter("dob");
        String status = servletRequest.getParameter("status");

        System.out.println(name);
        System.out.println(email);
        System.out.println(no);
        System.out.println(age);
        System.out.println(address);
        System.out.println(gender);
        System.out.println(dob);
        System.out.println(status);
        System.out.println("--------------------------");
    }
}
