package com.xworkz.springProject.trminal;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@Component
//@ToString
@Scope("")
public class Terminal   {
    @Value("1")
    private int tId;
    @Value("T1")
    private String terminalName;

}
