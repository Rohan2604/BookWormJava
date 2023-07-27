package com.bookworm.BWMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.bookworm.*")
@EntityScan(basePackages="com.bookworm*")
@EnableJpaRepositories(basePackages="com.bookworm.*")

public class PdfGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfGenerationApplication.class, args);
	}

}
