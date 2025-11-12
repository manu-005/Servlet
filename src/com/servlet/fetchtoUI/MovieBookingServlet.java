package com.servlet.fetchtoUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/movie" , loadOnStartup = 1)
public class MovieBookingServlet extends HttpServlet {

    public MovieBookingServlet(){
        System.out.println("Movie Booking object created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String nm =  req.getParameter("mName");
        String urNm =  req.getParameter("urName");
        String loc =  req.getParameter("loc");
        String query =  req.getParameter("query");
        String seat =  req.getParameter("seat");

        PrintWriter p = resp.getWriter();

        p.println("<!doctype html>");
        p.println("<html lang='en'>");
        p.println("<head>");
        p.println("<meta charset='utf-8'>");
        p.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        p.println("<title>Movie Booking Details</title>");
        p.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet'>");
        p.println("</head>");

        p.println("<body class='bg-light'>");
        p.println("<div class='container mt-5'>");
        p.println("<div class='card shadow p-4'>");
        p.println("<h2 class='text-center text-primary mb-4'> Movie Booking Details</h2>");
        p.println("<p><strong>Movie Name:</strong> " + nm + "</p>");
        p.println("<p><strong>Your Name:</strong> " + urNm + "</p>");
        p.println("<p><strong>Location:</strong> " + loc + "</p>");
        p.println("<p><strong>Seat Type:</strong> " + seat + "</p>");
        p.println("<p><strong>Query:</strong> " + query + "</p>");
        p.println("<div class='text-center mt-4'>");
        p.println("<a href='movie.html' class='btn btn-primary'>Go Back</a>");
        p.println("<a href='index.html' class='btn btn-'>Close</a>");

        p.println("</div>");
        p.println("</div>");
        p.println("</div>");
        p.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js'></script>");
        p.println("</body>");
        p.println("</html>");

    }
}
