package com.xworkz.tvSystem.servlet;

import com.xworkz.tvSystem.dto.AddTvDTO;
import com.xworkz.tvSystem.dto.SearchTVDTO;
import com.xworkz.tvSystem.service.ServiceImpl;
import com.xworkz.tvSystem.service.ServiceInterface;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/searchByBrand",loadOnStartup = 1)
public class SearchBrandServlet extends HttpServlet {

    public SearchBrandServlet(){
        System.out.println("SearchTVServlet object created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("search by tv brand do get started..");

        String brand = req.getParameter("brand");

        SearchTVDTO searchTVDTO = new SearchTVDTO(brand);
        ServiceInterface serviceInterface = new ServiceImpl();

        List<AddTvDTO> searchAndUpdate = serviceInterface.validForBrand(searchTVDTO);
        System.out.println("search .."+searchAndUpdate);


        if(!searchAndUpdate.isEmpty()){

            req.setAttribute("dtoBrand",searchAndUpdate);

            req.getRequestDispatcher("SearchTVByBrandResult.jsp").forward(req,resp);

            System.out.println("searched"+searchAndUpdate);
        }else{
            req.setAttribute("error","invalid ...not exists..");
            System.out.println("not fetch data..");

            req.getRequestDispatcher("SearchTVByBrandResult.jsp").forward(req,resp);

        }


        System.out.println("search tv doget ended..");
    }
}