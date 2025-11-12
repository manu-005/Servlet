package com.xworkz.pro.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/shoulder",loadOnStartup = 1)
public class Muscle extends GenericServlet {

    public Muscle(){
        System.out.println("Muscle servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("override method");

    }
}
