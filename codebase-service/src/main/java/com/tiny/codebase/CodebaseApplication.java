package com.tiny.codebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CodebaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodebaseApplication.class, args);
	}

}
