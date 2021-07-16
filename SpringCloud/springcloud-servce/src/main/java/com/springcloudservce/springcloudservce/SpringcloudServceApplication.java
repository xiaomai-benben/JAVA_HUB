package com.springcloudservce.springcloudservce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@Configuration
public class SpringcloudServceApplication {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServceApplication.class, args);
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String servce(){
       return restTemplate.getForEntity("http://localhost:8081/test/4564",String.class).getBody();
    }


}
