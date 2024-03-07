package com.sapient.controller;

import com.sapient.beans.Insurance;
import com.sapient.exception.InsuranceDetailsNotValidException;
import com.sapient.interfaces.IInsuranceController;

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
