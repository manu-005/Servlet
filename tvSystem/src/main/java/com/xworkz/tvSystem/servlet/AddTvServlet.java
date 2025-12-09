package com.xworkz.tvSystem.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.function.BooleanSupplier;

@WebServlet(urlPatterns = "/addTv", loadOnStartup = 1)
public class AddTvServlet extends HttpServlet {
    
    public AddTvServlet(){
        System.out.println("Ad tv servlet object is created...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("add tv do post started..");

        resp.setContentType("text/html");

        int id = Integer.parseInt(req.getParameter("tvId"));
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        int size = Integer.parseInt(req.getParameter("size"));
        String avail = req.getParameter("avail");

        boolean a = "yes".equalsIgnoreCase(avail);

        System.out.println(id +""+ name  +""+brand  +""+size +""+a);
        System.out.println("get all values from form..");

        req.setAttribute("id",id);
        req.setAttribute("name",name);
        req.setAttribute("brand",brand);
        req.setAttribute("size",size);
        req.setAttribute("avail",avail);

        req.getRequestDispatcher("AddTvResult.jsp").forward(req, resp);



        System.out.println("add tv do post ended..");
    }
}
