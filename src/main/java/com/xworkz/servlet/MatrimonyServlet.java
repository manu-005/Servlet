package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/matrimony", loadOnStartup = 1)
public class MatrimonyServlet extends HttpServlet {

    public MatrimonyServlet(){
        System.out.println("Matrimony object created..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("do post started..");
resp.setContentType("text/type");

String email = req.getParameter("email");
String lookingFor = req.getParameter("lookingFor");
        String gender = req.getParameter("gender");
        String pName = req.getParameter("pName");
        String dob = req.getParameter("dob");
        String motherTongue = req.getParameter("motherTongue");
        String religion = req.getParameter("religion");
        String martialStatus = req.getParameter("martialStatus");
        String height = req.getParameter("height");


req.setAttribute("email",email);
req.setAttribute("lookingFor",lookingFor);
req.setAttribute("gender",gender);
req.setAttribute("pName",pName);
req.setAttribute("dob",dob);
req.setAttribute("motherTongue",motherTongue);
req.setAttribute("religion",religion);
req.setAttribute("martialStatus",martialStatus);
req.setAttribute("height",height);

        req.getRequestDispatcher("MatrimonyResult.jsp").forward(req, resp);

        System.out.println("do post ended..");
    }
}
