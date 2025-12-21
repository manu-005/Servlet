package com.xworkz.iplbid.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
public class PlayerBidDTO {

    private  String playerName;
    private  String companyName;
    private  double bidAmount;
}
