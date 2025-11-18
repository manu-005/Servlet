package com.xworkz.cafeteria;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cafeteria",  loadOnStartup = 1)
public class CafeteriaServlet extends HttpServlet {

    public CafeteriaServlet(){
        System.out.println("Cafeteria servlet object create..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String loc = req.getParameter("loc");
        String type = req.getParameter("type");
        String price = req.getParameter("price");
        String fNm = req.getParameter("fNm");
        String owNm = req.getParameter("owNm");
        String gstNo = req.getParameter("gstNo");


        req.setAttribute("name",name);
        req.setAttribute("loc",loc);
        req.setAttribute("type",type);
        req.setAttribute("price",price);
        req.setAttribute("fNm",fNm);
        req.setAttribute("owNm",owNm);
        req.setAttribute("gstNo",gstNo);

       RequestDispatcher requestDispatcher =  req.getRequestDispatcher("CafeteriaResult.jsp");
       requestDispatcher.forward(req,resp);
    }
}
