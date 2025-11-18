package com.xworkz.feedBack;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedBack",loadOnStartup = 1)
public class FeedBackServlet extends HttpServlet {

    public FeedBackServlet(){
        System.out.println("Feed Back Servlet object created..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");


        String name = req.getParameter("name");
                String email = req.getParameter("email");
                String comments = req.getParameter("comments");
                String rating = req.getParameter("rating");

          req.setAttribute("name", name);
        req.setAttribute("email", email);
        req.setAttribute("comments", comments);
        req.setAttribute("rating", rating);


          RequestDispatcher requestDispatcher = req.getRequestDispatcher("FeedBackResult.jsp");
        requestDispatcher.forward(req,resp);

    }
}
