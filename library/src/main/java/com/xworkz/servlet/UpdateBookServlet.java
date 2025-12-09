package com.xworkz.servlet;

import com.xworkz.constants.BookConstants;
import com.xworkz.dto.BookDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.Optional;

@WebServlet(urlPatterns = "/update", loadOnStartup = 1)
public class UpdateBookServlet extends HttpServlet {

    UpdateBookServlet (){
        System.out.println("updte servlet object created..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("update do get started ..");

        String bName = req.getParameter("bName");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String search = " select * from book where bName = ?;";
        try (Connection connection = DriverManager.getConnection(BookConstants.URL.getS(), BookConstants.USERNAME.getS(), BookConstants.PWD.getS());
             PreparedStatement statement = connection.prepareStatement(search)) {

//           SearchByBookNameDTO searchByBookNameDTO = new SearchByBookNameDTO(bName);
            System.out.println("connection started..");
            statement.setString(1,bName);

//            statement.setString(1, searchByBookNameDTO.getBName());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                System.out.println("while fetching data ...");
                String bNm = resultSet.getString(1);
                String aNm = resultSet.getString(2);
                int price = resultSet.getInt(3);
                int copy = resultSet.getInt(4);
                boolean avail = resultSet.getBoolean(5);

//                BookDTO bookDTO = new BookDTO(bNm,aNm,price,copy,avail);
//                req.setAttribute("dto", bookDTO);

                req.setAttribute("bNm", bNm);
                req.setAttribute("aNm", aNm);
                req.setAttribute("price", price);
                req.setAttribute("copy", copy);
                req.setAttribute("avail", avail);

                System.out.println("send to update Book ...");

                req.getRequestDispatcher("UpdateBook.jsp").forward(req, resp);

                System.out.println("if ended...");
            }
            else{
                req.setAttribute("error", "Book is not Exist..");

                req.getRequestDispatcher("UpdateBook.jsp").forward(req, resp);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("do get ended...");
    }

}
