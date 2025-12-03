package com.xworkz.servlet;

import com.xworkz.dao.BookDAOImpl;
import com.xworkz.dao.BookDAOInterface;
import com.xworkz.dto.BookDTO;
import com.xworkz.service.BookValidateImpl;
import com.xworkz.service.BookValidateInterface;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        boolean avail = Boolean.parseBoolean(isAvailable);

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
            bookDAOInterface.saveBookData(bookDTO);
        }
        req.getRequestDispatcher("BookResult.jsp").forward(req, resp);

        System.out.println("do post Started..");
    }
}
