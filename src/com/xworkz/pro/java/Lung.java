package com.xworkz.pro.java;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/Lung",loadOnStartup = 22)
public class Lung extends GenericServlet {

    public Lung(){
        System.out.println("Lung servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("==============");
    }
}
