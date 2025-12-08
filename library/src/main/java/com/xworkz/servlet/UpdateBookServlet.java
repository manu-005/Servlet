package com.xworkz.servlet;

import com.xworkz.constants.BookConstants;
import com.xworkz.dto.BookDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

@WebServlet(urlPatterns = "/update", loadOnStartup = 1)
public class UpdateBookServlet extends HttpServlet {

    UpdateBookServlet (){
        System.out.println("updte servlet object created..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("update do post started ..");

        String nm = req.getParameter("bNm");

        BookDTO bookDTO=new BookDTO(nm);

        req.getRequestDispatcher("UpdateBook.jsp").forward(req,resp);


        System.out.println("update do post ended ..");

    }
}
