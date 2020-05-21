package com.gbt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author botaogao
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulRibbonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulRibbonServiceApplication.class, args);
    }

}
