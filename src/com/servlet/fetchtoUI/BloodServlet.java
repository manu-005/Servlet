package com.servlet.fetchtoUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/blood", loadOnStartup = 1)
public class BloodServlet extends HttpServlet {

    public BloodServlet(){
        System.out.println("blood servlet object created..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String nm =  req.getParameter("urName");
        String group =  req.getParameter("group");
        String quantity =  req.getParameter("quantity");
        String inst =  req.getParameter("inst");
        String pay =  req.getParameter("pay");

        PrintWriter p = resp.getWriter();

        p.println("<!doctype html>");
        p.println("<html lang='en'>");
        p.println("<head>");
        p.println("<meta charset='utf-8'>");
        p.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        p.println("<title>Blood Details</title>");
        p.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet'>");
        p.println("</head>");

        p.println("<body class='bg-light'>");
        p.println("<div class='container mt-5'>");
        p.println("<div class='card shadow p-4'>");
        p.println("<h2 class='text-center text-primary mb-4'> Blood Details</h2>");
        p.println("<p><strong>Your Name:</strong> " + nm + "</p>");
        p.println("<p><strong>Blood Group:</strong> " + group + "</p>");
        p.println("<p><strong>Quantity:</strong> " + quantity + "</p>");
        p.println("<p><strong>Payment Type:</strong> " + pay + "</p>");
        p.println("<p><strong>Instruction :</strong> " + inst + "</p>");
        p.println("<div class='text-center mt-4'>");
        p.println("<a href='blood.html' class='btn btn-primary'>Go Back</a>");
        p.println("</div>");
        p.println("</div>");
        p.println("</div>");
        p.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js'></script>");
        p.println("</body>");
        p.println("</html>");


    }
}
