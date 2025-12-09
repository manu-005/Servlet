package com.xworkz.tvSystem.servlet;

import com.xworkz.tvSystem.dto.AddTvDTO;
import com.xworkz.tvSystem.service.ServiceImpl;
import com.xworkz.tvSystem.service.ServiceInterface;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/update",loadOnStartup = 1)
public class UpdateServlet extends HttpServlet {

    public UpdateServlet(){
        System.out.println("Update Servlet object created...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("update do post started..");

        resp.setContentType("text/html");

        int id = Integer.parseInt(req.getParameter("tvId"));
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        double size = Double.parseDouble(req.getParameter("size"));
        String avail = req.getParameter("avail");

        boolean a = "yes".equalsIgnoreCase(avail);

        System.out.println(id +""+ name  +""+brand  +""+size +""+a);
        System.out.println("get all values from update form..");

        //pass to dto
        AddTvDTO addTvDTO = new AddTvDTO(id,name,brand,size,a);
        // validation
        ServiceInterface serviceInterface = new ServiceImpl();

        //------------------------------------------
        boolean update = serviceInterface.validateTvAndUpdate( addTvDTO);
        System.out.println(update);

        if (update) {
            req.setAttribute("id",id);
            req.setAttribute("name",name);
            req.setAttribute("brand",brand);
            req.setAttribute("size",size);
            req.setAttribute("avail",a);

            //servlet chaining
            req.setAttribute("success","Successfully updated TV details");
            req.getRequestDispatcher("UpdateResult.jsp").forward(req, resp);
        }else{
            req.setAttribute("error","not valid and not update TV details");
            req.getRequestDispatcher("UpdateResult.jsp").forward(req, resp);


        }


        System.out.println("update do post ended..");
    }
}
