package com.xworkz.iplbid.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {
    private String name;
    private int age;
    private String playerType;
    private String state;
    private int battingAvg;
    private int bowlingAvg;
    private int stumps;



}
