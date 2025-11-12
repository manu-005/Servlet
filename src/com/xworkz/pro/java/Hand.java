package com.xworkz.pro.java;

import com.sun.javafx.webkit.CursorManagerImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/Hand",loadOnStartup = 16)
public class Hand extends GenericServlet {

    public Hand(){
        System.out.println("Hand servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("================");
    }
}
