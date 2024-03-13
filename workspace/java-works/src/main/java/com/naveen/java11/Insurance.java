package com.naveen.java11;


public record Insurance
        (int insuranceId, String insuranceTitle, double insurancePremiumAmt) {


    public void setInsuranceTitle(String insuranceTitle) {
        if(insuranceTitle.length()<6) {
            System.out.println("sorry insurance name too small.. ");
            throw new TooSmallNameException("sorry Insurance Name too small"
                    + insuranceTitle);
        }
    }
}
