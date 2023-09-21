package com.example.gb.webclient.demo.webclientapp.rest;

import com.example.gb.webclient.demo.webclientapp.data.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CountryController {
    private final CountryService restcountriesService;

    @Autowired
    public CountryController(CountryService restcountriesService) {
        this.restcountriesService = restcountriesService;
    }

    @GetMapping("/country/{countryName}")
    public Mono<String> getCountryInfo(@PathVariable String countryName) {
        return restcountriesService.getCountryInfo(countryName);
    }

}

