package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/skill" , loadOnStartup = 1)
public class SkillSetDetailsServlet extends GenericServlet {

    public SkillSetDetailsServlet(){
        System.out.println("Skill Set Servlet Object created..");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String pskill = servletRequest.getParameter("pskill");
        String sskill = servletRequest.getParameter("sskill");
        String db = servletRequest.getParameter("db");
        String ide = servletRequest.getParameter("ide");
        String dob = servletRequest.getParameter("dob");
        String ui = servletRequest.getParameter("ui");

        System.out.println(name);
        System.out.println(email);
        System.out.println(pskill);
        System.out.println(sskill);
        System.out.println(db);
        System.out.println(ide);
        System.out.println(dob);
        System.out.println(ui);
        System.out.println("--------------------------");
    }
}
