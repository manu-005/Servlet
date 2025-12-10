package com.xworkz.springProject.config;

import com.xworkz.springProject.myproject.App;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages ="com.xworkz.springProject" )
public class MyprojectConfig {

    @Bean
    public Integer getAge(){
        return 56;
    }
    @Bean
    public Integer getPincode(){
        return 560033;
    }
    @Bean
    public String getname(){
        return "manoj";
    }
    @Bean
    public List<Integer>  getList(){

        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(345);
        list.add(456);

        return list;
    }
//
//    @Bean
//    public App getApp(){
//    return new App();
//    }


}
