package com.payeshgaran.cloudgatewaynew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayNewApplication.class, args);
    }

}
