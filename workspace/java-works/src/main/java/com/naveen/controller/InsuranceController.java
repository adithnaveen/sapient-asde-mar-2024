package com.naveen.controller;

import com.naveen.beans.Insurance;
import com.naveen.exception.InsuranceDetailsNotValidException;
import com.naveen.interfaces.IInsuranceController;

public class InsuranceController implements IInsuranceController {
    @Override
    public Insurance insertInsurance(Insurance insurance) {

        throw new InsuranceDetailsNotValidException();
//        return null;
    }

    @Override
    public boolean deleteInsurance(int insuranceId) {
        return false;
    }
    // shall create an instance of Servic elayer
    // and invoice


}
