package com.example.springcircuitbreakerbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class SpringCircuitBreakerBookstoreApplication {

    @RequestMapping(value = "/suggested")
    public Mono<String> readingList(){
        return Mono.just("Intro to Algorithms, Theory of Computation ");
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringCircuitBreakerBookstoreApplication.class, args);
    }

}
