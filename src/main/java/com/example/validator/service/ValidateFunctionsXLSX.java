package com.example.validator.service;

import com.example.validator.model.PeopleXLSX;
import org.springframework.stereotype.Component;

@Component
public class ValidateFunctionsXLSX {

    public boolean validateInjuryLocation(PeopleXLSX person){
        return !person.getInjuryLocation().equals("N/A");
    }

    public boolean validateReportType(PeopleXLSX person){
        String reportType = person.getReportType();
        if(reportType.equals("Near Miss") || reportType.equals("Lost Time") || reportType.equals("First Aid")){
            return true;
        }
        return false;
    }
}
