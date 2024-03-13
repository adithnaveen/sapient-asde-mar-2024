package com.naveen.java11;

public class Mobile {
    private  int mobileId;
    private String mobileName;
    private double price;

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public String getMobileName() {

        return mobileName;
    }

    public void setMobileName(String mobileName) {
        if(mobileName.length()< 6) {
            this.mobileName = "";
            throw new TooSmallNameException("Sorry Name too small ");
        }
        this.mobileName = mobileName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
