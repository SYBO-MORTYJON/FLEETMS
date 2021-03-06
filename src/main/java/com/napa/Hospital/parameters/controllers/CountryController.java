package com.napa.Hospital.parameters.controllers;

import com.napa.Hospital.parameters.models.Country;
import com.napa.Hospital.parameters.services.CountryService;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getAll( Model model) {
         List<Country> countries= countryService.getAll();
         model.addAttribute("countries",countries);
         return "parameters/countryList";
    }

    @GetMapping("/countryAdd")
    public String addCountry(){
        return "parameters/countryAdd";
    }
}
