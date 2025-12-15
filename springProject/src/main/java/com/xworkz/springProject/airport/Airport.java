package com.xworkz.springProject.airport;

import com.xworkz.springProject.trminal.Terminal;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter

@Component
@ToString
public class Airport {

    public Airport(){
        System.out.println("default constructor..");
    }

    @Autowired
    Terminal terminal;

    @Value("1")
    private int aId;
    @Value("KIA")
    private String airportName;
    @Value("Devanahalli")
    private String   loc;
}
