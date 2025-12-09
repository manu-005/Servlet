package com.xworkz.springProject;


import com.xworkz.springProject.config.MyprojectConfig;
import com.xworkz.springProject.myproject.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyProjectRunner
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyprojectConfig.class);
       Project project =  applicationContext.getBean(Project.class);
    }
}
