package com.xworkz.springProject.question;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@ToString
@Getter
@Component
public class Question {

    public Question(){
        System.out.println("default constructor ...call");
    }

    private String type;
}
