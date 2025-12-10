package com.xworkz.springProject;


import com.xworkz.springProject.config.MyprojectConfig;
import com.xworkz.springProject.myproject.App;
import com.xworkz.springProject.myproject.Bank;
import com.xworkz.springProject.myproject.Project;
import com.xworkz.springProject.question.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyProjectRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyprojectConfig.class);
        Project project = applicationContext.getBean(Project.class);

        project.setId(413);
        project.setName("Manoj");
        System.out.println(project);


//        ---------------------------------------------------
        App app = applicationContext.getBean(App.class);

        app.setAppId(12);
        app.setAppName("WhatsApp");

       String name = app.getAppName();
        System.out.println("name : "+name);
       System.out.println(app);
        System.out.println("======================");

        Integer integer = applicationContext.getBean("getAge",Integer.class);
        System.out.println(integer);

        System.out.println();
        System.out.println("======================");


        Bank bank = applicationContext.getBean(Bank.class);
        bank.setBankName("ICICI");
        bank.setId(123);
        System.out.println(bank);

        Question question = applicationContext.getBean(Question.class);
question.setType("apti");
        System.out.println(question);



    }
}
