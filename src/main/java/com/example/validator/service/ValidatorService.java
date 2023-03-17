package com.example.validator.service;

import com.example.validator.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidatorService {

    private ValidateFunctions validateFunctions;

    @Autowired
    public ValidatorService(ValidateFunctions validateFunctions) {
        this.validateFunctions = validateFunctions;
    }

    public boolean validate(People person){
        if(validateFunctions.validateEmail(person)
                &&validateFunctions.validateBirthDate(person)
                && validateFunctions.validateJob(person)){

            return true;
        }
        return false;
    }
}
