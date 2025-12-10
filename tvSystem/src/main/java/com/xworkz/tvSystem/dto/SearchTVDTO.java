package com.xworkz.tvSystem.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SearchTVDTO implements Comparable{

    private String name;
    private String brand;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public SearchTVDTO(String brand){
        this.brand=brand;
    }


}
