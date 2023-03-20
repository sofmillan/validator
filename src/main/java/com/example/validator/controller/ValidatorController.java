package com.example.validator.controller;

import com.example.validator.model.PeopleCSV;
import com.example.validator.model.PeopleXLSX;
import com.example.validator.service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validator")
public class ValidatorController {

    private ValidatorService validatorService;

    @Autowired
    public ValidatorController(ValidatorService validatorService) {
        this.validatorService = validatorService;
    }

    @PostMapping("/csv")
    public boolean process(@RequestBody PeopleCSV person){
        return validatorService.validateCSV(person);
    }

   @PostMapping("/xlsx")
    public boolean process(@RequestBody PeopleXLSX person){
        return validatorService.validateXLSX(person);
    }

}
