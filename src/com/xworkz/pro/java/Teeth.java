package com.xworkz.pro.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet (urlPatterns = "/Teeth", loadOnStartup = 9)
public class Teeth extends GenericServlet {

    public Teeth(){
        System.out.println("Teeth servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("===============");
    }
}
