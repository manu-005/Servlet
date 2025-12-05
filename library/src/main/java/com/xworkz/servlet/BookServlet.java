package com.xworkz.servlet;

import com.xworkz.constants.BookConstants;
import com.xworkz.dao.BookDAOImpl;
import com.xworkz.dao.BookDAOInterface;
import com.xworkz.dto.BookDTO;
import com.xworkz.dto.SearchByBookNameDTO;
import com.xworkz.exception.BookValidationException;
import com.xworkz.service.BookValidateImpl;
import com.xworkz.service.BookValidateInterface;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.io.IOException;
import java.sql.*;

@WebServlet(urlPatterns = "/book", loadOnStartup = 1)
public class BookServlet extends HttpServlet {

    public BookServlet() {
        System.out.println("Book servlet object created");
    }

    BookDAOInterface bookDAOInterface = new BookDAOImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("do post Started..");

        resp.setContentType("text/html");

        String bName = req.getParameter("bName");
        String aName = req.getParameter("aName");
        String price = req.getParameter("price");
        String noOfCopies = req.getParameter("noOfCopies");
        String isAvailable = req.getParameter("isAvailable");

        int p = Integer.parseInt(price);
        int copy = Integer.parseInt(noOfCopies);
        boolean avail = "yes".equalsIgnoreCase(isAvailable);

        System.out.println(bName);
        System.out.println(aName);
        System.out.println(price);
        System.out.println(noOfCopies);
        System.out.println(isAvailable);

        req.setAttribute("bName", bName);
        req.setAttribute("aName", aName);
        req.setAttribute("price", price);
        req.setAttribute("noOfCopies", noOfCopies);
        req.setAttribute("isAvailable", isAvailable);

        BookDTO bookDTO = new BookDTO(bName, aName, p, copy, avail);

        BookValidateInterface bookValidateInterface = new BookValidateImpl();

        boolean valid = bookValidateInterface.validate(bookDTO);


        if (valid) {
            System.out.println("valid before  check exist..");

           boolean exist = bookDAOInterface.bNameExist(bookDTO);
            if (!exist) {
                System.out.println("check and saved");
                bookDAOInterface.saveBookData(bookDTO);
                req.setAttribute("success", "Book Details Successfully Added..");
            }

        } else {
            req.setAttribute("error", "Invalid Details check and insert");
        }
        req.getRequestDispatcher("BookResult.jsp").forward(req, resp);

        System.out.println("do post Started..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do get started...");

        resp.setContentType("text/html");

       String bName= req.getParameter("bName");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        String search = " select * from book where bName = ?;";
       try(Connection connection = DriverManager.getConnection(BookConstants.URL.getS(),BookConstants.USERNAME.getS(), BookConstants.PWD.getS());
           PreparedStatement statement = connection.prepareStatement(search)){

           SearchByBookNameDTO searchByBookNameDTO = new SearchByBookNameDTO(bName);
           System.out.println("connection started..");
//           statement.setString(1,bName);
           statement.setString(1,searchByBookNameDTO.getBName());
        ResultSet resultSet = statement.executeQuery();

        while(resultSet.next()){
            System.out.println("while fetching data ...");
            String bNm= resultSet.getString(1);
            String aNm= resultSet.getString(2);
            int price= resultSet.getInt(3);
            int copy= resultSet.getInt(4);
            boolean avail= resultSet.getBoolean(5);

            req.setAttribute("bNm",bNm);
            req.setAttribute("aNm",aNm);
            req.setAttribute("price",price);
            req.setAttribute("copy",copy);
            req.setAttribute("avail",avail);


            System.out.println("send to search result ...");

            req.getRequestDispatcher("SearchByBookName.jsp").forward(req,resp);

            System.out.println("while ended...");
        }


       } catch (SQLException e) {
           throw new RuntimeException(e);
       }


        System.out.println("do get ended...");
    }
}
