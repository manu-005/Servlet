package com.xworkz.survey.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/index", loadOnStartup = 1)
public class IndexServlet extends HttpServlet {

    public IndexServlet(){
        System.out.println("index object created..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        System.out.println("index to survey chaining...start");
        req.getRequestDispatcher("Survey.jsp").forward(req,resp);
    }
}
