# SpringBoot Circuit Breaker Microservice

A minimaslitic microservice developed with Spring Boot & Spring Cloud with an overall containerization using Docker. 

The idea here is to create a Client-Server Microservice Application and apply Spring Cloud's Circuit Breaker library so that "When we wrap a method call in a circuit breaker, Spring Cloud Circuit Breaker watches for failing calls to that method and, if failures build up to a specified threshold, Spring Cloud Circuit Breaker opens the circuit so that subsequent calls automatically fail. While the circuit is open, Spring Cloud Circuit Breaker redirects calls to the method, and they are passed on to our specified fallback method." - !

## How to - 

### Initialize the project

 - Go to [Spring Initializer](https://start.spring.io/)
 - Choose Maven/Gradle for project build. 
 - Next you want to choose a language, I went with Java but you can choose Kotlin or Groovy
 - Further, choose a stable version of Spring, I went with 3.1.1
 - Next is the Project Metadata 