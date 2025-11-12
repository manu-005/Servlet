package com.servlet.fetchtoUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/flight",loadOnStartup = 1)
public class FlightBookingServlet extends HttpServlet {

    public FlightBookingServlet(){
        System.out.println("Flight Booking Object is created..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String nm =  req.getParameter("fName");
        String urNm =  req.getParameter("urName");
        String desti =  req.getParameter("desti");
        String query =  req.getParameter("query");
        String pay =  req.getParameter("pay");

        PrintWriter p = resp.getWriter();

        p.println("<!doctype html>");
        p.println("<html lang='en'>");
        p.println("<head>");
        p.println("<meta charset='utf-8'>");
        p.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        p.println("<title>Flight Booking Details</title>");
        p.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet'>");
        p.println("</head>");

        p.println("<body class='bg-light'>");
        p.println("<div class='container mt-5'>");
        p.println("<div class='card shadow p-4'>");
        p.println("<h2 class='text-center text-primary mb-4'> Flight Booking Details</h2>");
        p.println("<p><strong>Flight Name:</strong> " + nm + "</p>");
        p.println("<p><strong>Your Name:</strong> " + urNm + "</p>");
        p.println("<p><strong>Destination :</strong> " + desti + "</p>");
        p.println("<p><strong>Payment Type:</strong> " + pay + "</p>");
        p.println("<p><strong>Any Query:</strong> " + query + "</p>");
        p.println("<div class='text-center mt-4'>");
        p.println("<a href='flight.html' class='btn btn-primary'>Go Back</a>");
        p.println("</div>");
        p.println("</div>");
        p.println("</div>");
        p.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js'></script>");
        p.println("</body>");
        p.println("</html>");


    }
}
