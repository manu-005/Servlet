package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/patient",loadOnStartup = 1)
public class PatientServlet extends GenericServlet {

    public PatientServlet(){
        System.out.println("Patient Servlet Object is Created..");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("server running");

        String fname =servletRequest.getParameter("fname");
        String lname =servletRequest.getParameter("lname");
        String dob =servletRequest.getParameter("dob");
        String gender =servletRequest.getParameter("gender");
        String address =servletRequest.getParameter("address");
        String city =servletRequest.getParameter("city");
        String state =servletRequest.getParameter("state");
        String home =servletRequest.getParameter("home");
        String personal =servletRequest.getParameter("personal");
        String weight =servletRequest.getParameter("weight");
        String height =servletRequest.getParameter("height");
        String status =servletRequest.getParameter("status");
        String desc =servletRequest.getParameter("desc");

        servletResponse.getWriter().println("Patient added successfully..");

        System.out.println("Full name :" + fname);
        System.out.println("Last name :" + lname);
        System.out.println("Date of Birth :" + dob);
        System.out.println("Gender :" + gender);
        System.out.println("Address :" + address);
        System.out.println("City :" + city);
        System.out.println("State:" + state);
        System.out.println("Home number:" + home);
        System.out.println("Personal Mobile Number :" + personal);
        System.out.println("Weight :" + weight);
        System.out.println("Height :" + height);
        System.out.println("Meritial Status:" + status);
        System.out.println("Description:" + desc);
        System.out.println("---------------------------------");

    }
}
