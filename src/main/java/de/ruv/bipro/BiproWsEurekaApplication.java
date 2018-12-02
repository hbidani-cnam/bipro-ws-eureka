package de.ruv.bipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BiproWsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiproWsEurekaApplication.class, args);
	}
}