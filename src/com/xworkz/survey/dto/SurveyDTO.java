package com.xworkz.survey.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SurveyDTO implements Serializable, Comparable {

    private String namme;
    private String occupation;

    private String education;
    private String nativePlace;
    private String bikeNumber;
    private String carNumber;
    private String mobileNo;
    private String adharNo;
    private String panCard;
    private String voterId;
    private String passportNo;
    private String rationCardNo;
    private String income;
    private String bankAccount;
    private String fatherName;
    private String motherName;
    private String married;
    private String wifeHusbandName;
    private String noOfChildren;
    private String noOfCycle;
    private String noOfFamilyMember;
    private String insuranceCompany;
    private String insuranceNo;
    private String laptopModel;
    private String tvModel;
    private String landInAcres;
    private String totalSites;
    private String rtcNo;
    private String taxesPaid;
    private String govtEmployee;
    private String disabled;
    private String caste;
    private String religion;
    private String motherTongue;
    private String age;
    private String dateOfBirth;
    private String knownDiseases;
    private String height;
    private String weight;
    private String complexion;
    private String bloodGroup;
    private String shoeSize;
    private String noOfShoes;
    private String friendsName;
    private String electricityBillNo;
    private String waterBillNo;
    private String buildingOwnerName;
    private String crop;
    private String loanNo;
    private String loanBalance;
    private String loanType;
    private String goldInGms;
    private String silverInGms;
    private String petName;
    private String noOfCows;
    private String shareHolding;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
