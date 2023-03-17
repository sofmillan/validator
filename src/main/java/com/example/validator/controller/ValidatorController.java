package com.example.validator.controller;

import com.example.validator.model.People;
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

    @PostMapping("/lines")
    public boolean process(@RequestBody  People person){
        return validatorService.validate(person);
    }
}
