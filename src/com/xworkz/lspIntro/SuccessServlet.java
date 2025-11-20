package com.xworkz.lspIntro;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/success",loadOnStartup = 1)
public class SuccessServlet extends HttpServlet {

   public  SuccessServlet(){
        System.out.println("Success Servlet Object Created..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doPost Running..");

        resp.setContentType("text/html");

        resp.getWriter().println("Successfully Stored");

        String name = req.getParameter("name");
        String mail = req.getParameter("mail");
        String no = req.getParameter("no");
        String comment = req.getParameter("comment");

        req.setAttribute("name",name);
        req.setAttribute("mail",mail);
        req.setAttribute("number",no);
        req.setAttribute("comments",comment);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");

        requestDispatcher.forward(req,resp);


        System.out.println("doPost closed....");
    }
}
