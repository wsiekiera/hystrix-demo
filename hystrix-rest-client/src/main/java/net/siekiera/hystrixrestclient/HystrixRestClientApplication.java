package net.siekiera.hystrixrestclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class HystrixRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixRestClientApplication.class, args);
	}

}
