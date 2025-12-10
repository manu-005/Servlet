package com.xworkz.springProject.myproject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
@Setter
@ToString
@Getter
@Component
public class Laptop {
    private int id;
    private String name;
}
