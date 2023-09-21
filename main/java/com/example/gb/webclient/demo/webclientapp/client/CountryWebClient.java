package com.example.gb.webclient.demo.webclientapp.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class CountryWebClient {
    @Bean
    public WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }
}
