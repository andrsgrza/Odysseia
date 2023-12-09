package com.angaar.odysseia;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.*")
@ComponentScan(basePackages = {"com.*"})
@EnableJpaRepositories(basePackages = "com.*")
public class OdysseiaApplication{

	public static void main(String[] args) {
		SpringApplication.run(OdysseiaApplication.class, args);
	}
	

}
