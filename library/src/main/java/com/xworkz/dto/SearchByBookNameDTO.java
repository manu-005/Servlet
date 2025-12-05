package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class SearchByBookNameDTO implements Serializable {

    private String bName;
}
