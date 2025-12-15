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
import java.sql.SQLException;
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



        //pass to dto
        AddTvDTO addTvDTO = new AddTvDTO(id,name,brand,size,a);
        // validation
        ServiceInterface serviceInterface = new ServiceImpl();
        try {
            boolean valid = serviceInterface.validateTvAndSave(addTvDTO);
            System.out.println(valid);
            if (valid) {
                req.setAttribute("id",id);
                req.setAttribute("name",name);
                req.setAttribute("brand",brand);
                req.setAttribute("size",size);
                req.setAttribute("avail",a);

                //servlet chaining
                req.setAttribute("success","Successfully Added TV");
            }
        }
        catch (IllegalArgumentException | NullPointerException e)
        {
//            e.printStackTrace();

            req.setAttribute("error",e.getMessage());

        }

            req.getRequestDispatcher("AddTvResult.jsp").forward(req, resp);

        System.out.println("add tv do post ended..");
    }
}
