package com.napa.Hospital.parameters.controllers;

import com.napa.Hospital.parameters.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;
}
