package com.sapient.beans;

public class Insurance {

    // this is a bean class

    private int insuranceId;
    private String insuranceName;
    private String insuranceTitle;
    private int insuranceDuration;
    // etc ...

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceId=" + insuranceId +
                ", insuranceName='" + insuranceName + '\'' +
                ", insuranceTitle='" + insuranceTitle + '\'' +
                ", insuranceDuration=" + insuranceDuration +
                '}';
    }

    public Insurance() {
    }

    public Insurance(int insuranceId, String insuranceName, String insuranceTitle, int insuranceDuration) {
        this.insuranceId = insuranceId;
        this.insuranceName = insuranceName;
        this.insuranceTitle = insuranceTitle;
        this.insuranceDuration = insuranceDuration;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceTitle() {
        return insuranceTitle;
    }

    public void setInsuranceTitle(String insuranceTitle) {
        this.insuranceTitle = insuranceTitle;
    }

    public int getInsuranceDuration() {
        return insuranceDuration;
    }

    public void setInsuranceDuration(int insuranceDuration) {
        this.insuranceDuration = insuranceDuration;
    }
}
