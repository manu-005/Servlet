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

@WebServlet(urlPatterns = "/edit", loadOnStartup = 1)
public class EditServlet extends HttpServlet {

    public EditServlet(){
        System.out.println("edit servlet object created..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("edit do post started..");

        String name= req.getParameter("id");

        System.err.println("servlet name: "+name);

        SearchTVDTO searchTVDTO = new SearchTVDTO();
searchTVDTO.setName(name);
        System.out.println("searchDto :"+ searchTVDTO);
        ServiceInterface serviceInterface = new ServiceImpl();
      Optional<AddTvDTO> edit  = serviceInterface.validForSearch(searchTVDTO);

      if (edit.isPresent()){

          req.setAttribute("edit",edit.get());
          req.getRequestDispatcher("UpdateForm.jsp").forward(req,resp);

      }
      else{
          System.err.println("not get data to form..");
      }

        System.out.println("edit do post ended...");
    }
}
