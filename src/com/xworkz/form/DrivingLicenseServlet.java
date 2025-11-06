package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/drivingLicense", loadOnStartup = 1)
public class DrivingLicenseServlet extends GenericServlet {

    public DrivingLicenseServlet(){
        System.out.println("Driving License Servlet object Created..");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String fname =servletRequest.getParameter("fname");
        String mname =servletRequest.getParameter("mname");
        String lname =servletRequest.getParameter("lname");
        String dob =servletRequest.getParameter("dob");
        String birthPlace =servletRequest.getParameter("birthPlace");
        String gender =servletRequest.getParameter("gender");
        String address =servletRequest.getParameter("address");
        String city =servletRequest.getParameter("city");
        String state =servletRequest.getParameter("state");
        String country =servletRequest.getParameter("country");
        String personal =servletRequest.getParameter("personal");
        String weight =servletRequest.getParameter("weight");
        String height =servletRequest.getParameter("height");
        String status =servletRequest.getParameter("status");

        System.out.println("Full name :" + fname);
        System.out.println("Full name :" + mname);
        System.out.println("Last name :" + lname);
        System.out.println("Date of Birth :" + dob);
        System.out.println("Full name :" + birthPlace);
        System.out.println("Gender :" + gender);
        System.out.println("Address :" + address);
        System.out.println("City :" + city);
        System.out.println("State:" + state);
        System.out.println("Home number:" + country);
        System.out.println("Personal Mobile Number :" + personal);
        System.out.println("Weight :" + weight);
        System.out.println("Height :" + height);
        System.out.println("Meritial Status:" + status);
        System.out.println("---------------------------------");


    }
}
