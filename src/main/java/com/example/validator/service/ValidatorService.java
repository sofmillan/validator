package com.example.validator.service;

import com.example.validator.model.PeopleCSV;
import com.example.validator.model.PeopleXLSX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidatorService {

    private ValidateFunctionscsv validateCSV;
    private ValidateFunctionsXLSX validateXSLX;

    @Autowired
    public ValidatorService(ValidateFunctionscsv validateCSV, ValidateFunctionsXLSX validateXSLX) {
        this.validateCSV = validateCSV;
        this.validateXSLX = validateXSLX;
    }

    public boolean validateCSV(PeopleCSV person){
        if(validateCSV.validateEmail(person)
                &&validateCSV.validateBirthDate(person)
                && validateCSV.validateJob(person)){

            return true;
        }
        return false;
    }

    public boolean validateXLSX(PeopleXLSX person){
        if(validateXSLX.validateInjuryLocation(person) && validateXSLX.validateReportType(person)){
            return true;
        }
        return false;
    }
}
