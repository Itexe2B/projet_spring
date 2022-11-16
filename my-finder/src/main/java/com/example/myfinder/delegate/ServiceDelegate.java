package com.example.myfinder.delegate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
//J'ai voulut faire 2 services delegate pour faire propre mais j'ai eu des erreurs.
public class ServiceDelegate {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbacked")
    public String getFilms(String schoolname) {
        return this.restTemplate.exchange(
                "http://localhost:8080/getFilms",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>() {
                },
                ""
        ).getBody();
    }

    @HystrixCommand(fallbackMethod = "fallbacked")
    public String getFilm(String film) {
        return this.restTemplate.exchange(
                "http://localhost:8080/getFilm/{film}",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>() {
                },
                film
        ).getBody();
    }

    @HystrixCommand(fallbackMethod = "fallbacked")
    public String getFilmByYear(String year) {
        return this.restTemplate.exchange(
                "http://localhost:8080/getFilmByYear/{year}",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>() {
                },
                year
        ).getBody();
    }


    @HystrixCommand(fallbackMethod = "fallbacked")
    public String getActors(String schoolname) {
        return this.restTemplate.exchange(
                "http://localhost:8080/getActors",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>() {
                },
                ""
        ).getBody();
    }

    @HystrixCommand(fallbackMethod = "fallbacked")
    public String getActor(String actor) {
        return this.restTemplate.exchange(
                "http://localhost:8080/getActor/{actor}",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>() {
                },
                actor
        ).getBody();
    }

    @HystrixCommand(fallbackMethod = "fallbacked")
    public String getActorsForFilm(String film) {
        return this.restTemplate.exchange(
                "http://localhost:8080/getActorsByFilm/{film}",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>() {
                },
                film
        ).getBody();
    }

    private String fallbacked(String schoolname) {
        return "breaker";
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
