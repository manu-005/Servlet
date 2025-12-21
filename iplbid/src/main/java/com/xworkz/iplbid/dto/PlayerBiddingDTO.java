package com.xworkz.iplbid.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerBiddingDTO {

    private String type;
   private int battingAvg ;
   private int bowlingAvg ;
   private int stumps ;
}
