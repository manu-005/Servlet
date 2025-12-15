package com.xworkz.myStudio.dto;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EventDTO {

    private  String eventName;
    private String date;
    private int days;
    private String ownerName;
    private long mobile;


}
