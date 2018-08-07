package com.algit.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FormApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormApplication.class, args);
	}
}
