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
import java.util.Optional;

@WebServlet(urlPatterns = "/search",loadOnStartup = 1)
public class SearchTVServlet extends HttpServlet {

    public SearchTVServlet(){
        System.out.println("Search TV Servlet Object created ..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("search tv doget started..");

        String name = req.getParameter("name");

        SearchTVDTO searchTVDTO = new SearchTVDTO();
        searchTVDTO.setName(name);

        ServiceInterface serviceInterface = new ServiceImpl();

        Optional<AddTvDTO> searchedAndGet = serviceInterface.validForSearch(searchTVDTO);
        System.out.println("search .."+searchedAndGet);


        if(searchedAndGet.isPresent()){

            req.setAttribute("dto",searchedAndGet.get());

            req.getRequestDispatcher("SearchedResult.jsp").forward(req,resp);

            System.out.println("searched"+searchedAndGet);
        }else{
            req.setAttribute("error","invalid ...not exists..");
            System.out.println("not fetch data..");

            req.getRequestDispatcher("SearchedResult.jsp").forward(req,resp);

        }


        System.out.println("search tv doget ended..");
    }
}
