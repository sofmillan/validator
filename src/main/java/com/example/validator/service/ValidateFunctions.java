package com.example.validator.service;

import com.example.validator.model.People;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

@Component
public class ValidateFunctions {

    public boolean validateEmail(People person){
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(person.getEmail());
        return matcher.find();
    }

    public boolean validateJob(People person){
        String job = person.getJobTitle();
        if(job.equals("Haematologist")||job.equals("Phytotherapist")|| job.equals("Building surveyor") ||
                job.equals("Insurance account manager") ||job.equals("Educational psychologist")){
            return true;
        }
        return false;
    }

    public boolean validateBirthDate(People person){
        String birthDate = person.getDateOfBirth();
        int year = Integer.parseInt(birthDate.substring(birthDate.length()-4));

        return year >= 1980;
    }
}
