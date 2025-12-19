package com.xworkz.iplbid.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
public class CompanyDTO {
    private String emailId;
    private String companyName;

    public CompanyDTO(String s){
        this.emailId = s;
    }
}
