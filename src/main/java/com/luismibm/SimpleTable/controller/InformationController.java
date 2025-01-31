package com.luismibm.SimpleTable.controller;

import com.luismibm.SimpleTable.service.AllCitiesService;
import com.luismibm.SimpleTable.service.AllCountriesService;
import com.luismibm.SimpleTable.service.AllProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InformationController {

    @Autowired private AllCountriesService allCountriesService;
    @Autowired private AllProvincesService allProvincesService;
    @Autowired private AllCitiesService allCitiesService;

    @GetMapping("/countries")
    public String getAllCountries(Model model) {
        model.addAttribute("countries", allCountriesService.getAllCountries());
        return "countriesList";
    }

    @GetMapping("/provinces")
    public String getAllProvinces(Model model) {
        model.addAttribute("provinces", allProvincesService.getAllProvinces());
        return "provincesList";
    }

    @GetMapping("/cities")
    public String getAllCities(Model model) {
        model.addAttribute("cities", allCitiesService.getAllCities());
        return "citiesList";
    }

}
