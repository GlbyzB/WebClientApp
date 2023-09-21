package com.example.gb.webclient.demo.webclientapp.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CountryService {
    private final WebClient webClient;

    public CountryService(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl("https://restcountries.com/v3.1").build();
    }


    public Mono<String> getCountryInfo(String countryName){
        return webClient.get().uri(uriBuilder -> uriBuilder .path("/name/{countryName}") .build(countryName))
                .retrieve().bodyToMono(String.class);
    }
/*
    public Mono<String> getCountryInfo(String countryName){
        return webClient.get().uri("/name/{countryName}", countryName)
                .retrieve().bodyToMono(String.class);
    }

 */
}
