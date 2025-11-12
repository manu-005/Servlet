package com.xworkz.pro.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/Hip",loadOnStartup = 30)
public class Hip extends GenericServlet {

    public Hip(){
        System.out.println("Hip servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("==============");
    }
}
