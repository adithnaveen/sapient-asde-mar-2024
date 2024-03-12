package com.naveen.interfaces;

import com.naveen.beans.Insurance;

public interface IInsuranceController {

    // method declaration shall happen here

    public Insurance insertInsurance (Insurance insurance);

    public boolean deleteInsurance(int insuranceId);

    // have all your other methods ...
}
