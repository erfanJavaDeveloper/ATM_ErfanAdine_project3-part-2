package com.payeshgaran.customer.customer;

import com.payeshgaran.customer.customer.entity.data.LegalPerson;
import com.payeshgaran.customer.customer.service.LegalPersonService;
import com.payeshgaran.customer.customer.service.RealPersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    @Bean
    CommandLineRunner run(LegalPersonService legalPersonService, RealPersonService realPersonService) {
        return args -> {

            legalPersonService.save(new LegalPerson());
            legalPersonService.save(new LegalPerson());


        };


    }
}
