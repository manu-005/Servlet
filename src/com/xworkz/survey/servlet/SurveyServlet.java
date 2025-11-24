package com.xworkz.survey.servlet;

import com.xworkz.survey.dao.SurveyDAOImpl;
import com.xworkz.survey.dao.SurveyDAOInterface;
import com.xworkz.survey.dto.SurveyDTO;
import com.xworkz.survey.exception.SurveyValidException;
import com.xworkz.survey.service.SurveyServiceImpl;
import com.xworkz.survey.service.SurveyServiceInterface;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/survey", loadOnStartup = 1)
public class SurveyServlet extends HttpServlet {
    public SurveyServlet(){
        System.out.println("survey servlet object created");
    }

    SurveyDAOInterface surveyDAOInterface = new SurveyDAOImpl();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost started");
        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String occupation = req.getParameter("occupation");
        String pan = req.getParameter("pan");

        String education = req.getParameter("education");
        String nativePlace = req.getParameter("nativePlace");
        String bike = req.getParameter("bike");
        String car = req.getParameter("car");
        String mno = req.getParameter("mno");
        String adhar = req.getParameter("pan");
        String vote = req.getParameter("vote");
        String passport = req.getParameter("passport");
        String ration = req.getParameter("ration");
        String income = req.getParameter("income");
        String bankAmt = req.getParameter("bankAmt");
        String fnm = req.getParameter("fnm");
        String mnm = req.getParameter("mnm");
        String marrie = req.getParameter("marrie");
        String wnm = req.getParameter("wnm");
        String child = req.getParameter("child");
        String cycle = req.getParameter("cycle");
        String members = req.getParameter("members");
        String insuranceC = req.getParameter("insuranceC");
        String insuranceNo = req.getParameter("insuranceNo");
        String lmodel = req.getParameter("lmodel");
        String tmodel = req.getParameter("tmodel");


        String land = req.getParameter("land");
        String site = req.getParameter("site");
        String rtc = req.getParameter("rtc");
        String tax = req.getParameter("tax");
        String emp = req.getParameter("emp");
        String pwd = req.getParameter("pwd");
        String caste = req.getParameter("caste");
        String religion = req.getParameter("religion");
        String mt = req.getParameter("mt");
        String age = req.getParameter("age");
        String dob = req.getParameter("dob");
        String disease = req.getParameter("disease");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");
        String complexion = req.getParameter("complexion");
        String bg = req.getParameter("bg");
        String ss = req.getParameter("ss");


        String ns = req.getParameter("ns");
        String fName = req.getParameter("fName");
        String eBillNo = req.getParameter("eBillNo");
        String wBillNo = req.getParameter("wBillNo");
        String ownNm = req.getParameter("ownNm");
        String crop = req.getParameter("crop");
        String loanNo = req.getParameter("loanNo");
        String loanBalance = req.getParameter("loanBalance");
        String loanType = req.getParameter("loanType");
        String gold = req.getParameter("gold");
        String silver = req.getParameter("silver");
        String pet = req.getParameter("pet");
        String cowNo = req.getParameter("cowNo");
        String share = req.getParameter("share");



        //dto....................
        SurveyDTO surveyDTO = new SurveyDTO(name,occupation,education,nativePlace,bike,car,
                mno,adhar,pan,vote,passport,ration,income,bankAmt,fnm,mnm,marrie,wnm,child,
                cycle,members,insuranceC,insuranceNo,lmodel,tmodel,land,site,rtc,tax,emp,pwd,
                caste,religion,mt,age,dob,disease,height,weight,complexion,bg,ss,ns,fName,eBillNo,wBillNo,ownNm,
                crop,loanNo,loanBalance,loanType,gold,silver,pet,cowNo,share);

        SurveyServiceInterface surveyServiceInterface = new SurveyServiceImpl();
        try {
            surveyServiceInterface.validate(surveyDTO);
            req.setAttribute("success","Successfully Filled...");

            req.setAttribute("name",name);
            req.setAttribute("occupation",occupation);

            req.setAttribute("education",education);
            req.setAttribute("nativePlace",nativePlace);
            req.setAttribute("bike",bike);
            req.setAttribute("car",car);
            req.setAttribute("mno",mno);
            req.setAttribute("adhar",adhar);
            req.setAttribute("pan",pan);

            req.setAttribute("vote",vote);
            req.setAttribute("passport",passport);
            req.setAttribute("ration",ration);
            req.setAttribute("income",income);
            req.setAttribute("bankAmt",bankAmt);


            req.setAttribute("fnm",fnm);
            req.setAttribute("mnm",mnm);
            req.setAttribute("marrie",marrie);
            req.setAttribute("wnm",wnm);
            req.setAttribute("child",child);
            req.setAttribute("cycle",cycle);
            req.setAttribute("members",members);
            req.setAttribute("insuranceC",insuranceC);
            req.setAttribute("insuranceNo",insuranceNo);
            req.setAttribute("lmodel",lmodel);
            req.setAttribute("tmodel",tmodel);
            req.setAttribute("land",land);
            req.setAttribute("site",site);
            req.setAttribute("rtc",rtc);
            req.setAttribute("tax",tax);
            req.setAttribute("emp",emp);
            req.setAttribute("pwd",pwd);
            req.setAttribute("caste",caste);

            req.setAttribute("religion",religion);
            req.setAttribute("mt",mt);
            req.setAttribute("age",age);
            req.setAttribute("dob",dob);
            req.setAttribute("disease",disease);
            req.setAttribute("height",height);
            req.setAttribute("weight",weight);
            req.setAttribute("complexion",complexion);
            req.setAttribute("bg",bg);
            req.setAttribute("ss",ss);
            req.setAttribute("ns",ns);
            req.setAttribute("fName",fName);

            req.setAttribute("eBillNo",eBillNo);
            req.setAttribute("wBillNo",wBillNo);
            req.setAttribute("ownNm",ownNm);
            req.setAttribute("crop",crop);
            req.setAttribute("loanNo",loanNo);
            req.setAttribute("loanBalance",loanBalance);
            req.setAttribute("loanType",loanType);
            req.setAttribute("gold",gold);
            req.setAttribute("silver",silver);
            req.setAttribute("pet",pet);
            req.setAttribute("cowNo",cowNo);
            req.setAttribute("share",share);

            surveyDAOInterface.saveData(surveyDTO);

        } catch (SurveyValidException e) {
            req.setAttribute("fail","Invalid..! Enter valid details...");
            System.out.println("in  valid..");
        }


        RequestDispatcher requestDispatcher= req.getRequestDispatcher("SurveyResult.jsp");
       requestDispatcher.forward(req,resp);




        System.out.println("do post closed");
    }
}
