package com.sapient.interfaces;

import com.sapient.beans.Insurance;

public interface IInsuranceController {

    // method declaration shall happen here

    public Insurance insertInsurance (Insurance insurance);

    public boolean deleteInsurance(int insuranceId);

    // have all your other methods ...
}
