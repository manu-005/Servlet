package com.xworkz.jspChaining;

import com.xworkz.jspChaining.dto.CoffeeDTO;
import com.xworkz.jspChaining.service.CoffeeImpl;
import com.xworkz.jspChaining.service.CoffeeInterface;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/coffee",loadOnStartup = 1)
public class CoffeeServlet extends HttpServlet {

    public CoffeeServlet(){
        System.out.println("Coffee Servlet Object created..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost Started");


        resp.setContentType("text/html");

        String type =  req.getParameter("type");
        String price =  req.getParameter("price");
        String quantity =  req.getParameter("quantity");
        String former =  req.getParameter("former");
        String loc =  req.getParameter("loc");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("CoffeeFormResult.jsp");

        req.setAttribute("type",type);
        req.setAttribute("price",price);
        req.setAttribute("quantity",quantity);
        req.setAttribute("former",former);
        req.setAttribute("loc",loc);

        requestDispatcher.forward(req,resp);
        System.out.println("doPost closed..");

        CoffeeDTO coffeeDTO = new CoffeeDTO(type,price,quantity,former,loc);

        CoffeeInterface coffeeInterface = new CoffeeImpl();
        coffeeInterface.validateDetails(coffeeDTO);
    }
}


