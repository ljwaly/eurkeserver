package com.ljw.eurek.server;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import org.springframework.boot.SpringApplication;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EurekaServerApplication.class, args);
		ConfigurableEnvironment environment = context.getEnvironment();
		
		System.out.println("\n----------------------------------------------------------\n\t");
		System.out.println("\t\tLocal:http://localhost:"+ environment.getProperty("server.port") +"\n\t");
		System.out.println("\t\tapp is running");
		System.out.println("\n----------------------------------------------------------\n\t");
		
		
		System.out.println(SpringApplication.class.getProtectionDomain().getCodeSource().getLocation());

	}
}
