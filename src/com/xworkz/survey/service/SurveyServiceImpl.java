package com.xworkz.survey.service;

import com.xworkz.survey.dto.SurveyDTO;
import com.xworkz.survey.exception.SurveyValidException;

public class SurveyServiceImpl implements SurveyServiceInterface {
    @Override
    public void validate(SurveyDTO surveyDTO) throws SurveyValidException {
        System.out.println("validation starts...");
        boolean valid = false;

        if (surveyDTO != null) {


                if (surveyDTO.getNamme() == null || surveyDTO.getNamme().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getOccupation() == null || surveyDTO.getOccupation().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getEducation() == null || surveyDTO.getEducation().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getNativePlace() == null || surveyDTO.getNativePlace().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getBikeNumber() == null || surveyDTO.getBikeNumber().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getCarNumber() == null || surveyDTO.getCarNumber().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getMobileNo() == null || surveyDTO.getMobileNo().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getAdharNo() == null || surveyDTO.getAdharNo().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getPanCard() == null || surveyDTO.getPanCard().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getVoterId() == null || surveyDTO.getVoterId().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getPassportNo() == null || surveyDTO.getPassportNo().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getRationCardNo() == null || surveyDTO.getRationCardNo().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getIncome() == null || surveyDTO.getIncome().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getBankAccount() == null || surveyDTO.getBankAccount().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getFatherName() == null || surveyDTO.getFatherName().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getMotherName() == null || surveyDTO.getMotherName().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getMarried() == null || surveyDTO.getMarried().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getWifeHusbandName() == null || surveyDTO.getWifeHusbandName().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getNoOfChildren() == null || surveyDTO.getNoOfChildren().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getNoOfCycle() == null || surveyDTO.getNoOfCycle().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getNoOfFamilyMember() == null || surveyDTO.getNoOfFamilyMember().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getInsuranceCompany() == null || surveyDTO.getInsuranceCompany().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getInsuranceNo() == null || surveyDTO.getInsuranceNo().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getLaptopModel() == null || surveyDTO.getLaptopModel().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getTvModel() == null || surveyDTO.getTvModel().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getLandInAcres() == null || surveyDTO.getLandInAcres().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getTotalSites() == null || surveyDTO.getTotalSites().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getRtcNo() == null || surveyDTO.getRtcNo().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getTaxesPaid() == null || surveyDTO.getTaxesPaid().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getGovtEmployee() == null || surveyDTO.getGovtEmployee().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getDisabled() == null || surveyDTO.getDisabled().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getCaste() == null || surveyDTO.getCaste().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getReligion() == null || surveyDTO.getReligion().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getMotherTongue() == null || surveyDTO.getMotherTongue().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getAge() == null || surveyDTO.getAge().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getDateOfBirth() == null || surveyDTO.getDateOfBirth().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getKnownDiseases() == null || surveyDTO.getKnownDiseases().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getHeight() == null || surveyDTO.getHeight().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getWeight() == null || surveyDTO.getWeight().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getComplexion() == null || surveyDTO.getComplexion().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getBloodGroup() == null || surveyDTO.getBloodGroup().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getShoeSize() == null || surveyDTO.getShoeSize().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getNoOfShoes() == null || surveyDTO.getNoOfShoes().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getFriendsName() == null || surveyDTO.getFriendsName().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getElectricityBillNo() == null || surveyDTO.getElectricityBillNo().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getWaterBillNo() == null || surveyDTO.getWaterBillNo().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getBuildingOwnerName() == null || surveyDTO.getBuildingOwnerName().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getCrop() == null || surveyDTO.getCrop().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getLoanNo() == null || surveyDTO.getLoanNo().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getLoanBalance() == null || surveyDTO.getLoanBalance().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getLoanType() == null || surveyDTO.getLoanType().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getGoldInGms() == null || surveyDTO.getGoldInGms().length() < 3) {
                    valid = true;
                }
                else if (surveyDTO.getSilverInGms() == null || surveyDTO.getSilverInGms().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getPetName() == null || surveyDTO.getPetName().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getNoOfCows() == null || surveyDTO.getNoOfCows().length() < 3) {
                    valid = true;
                } else if (surveyDTO.getShareHolding() == null || surveyDTO.getShareHolding().length() < 3) {
                    valid = true;
                }


                if (valid){
                throw new SurveyValidException("in valid ");
            }

        }

        System.out.println("validation ended....");
    }
}
