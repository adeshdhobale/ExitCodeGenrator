package com.boot.exitcodeGenrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExitCodeGenratorAppliaction {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=SpringApplication.run(ExitCodeGenratorAppliaction.class, args);
		
		int exitCode=SpringApplication.exit(applicationContext);
		System.exit(exitCode);
	}
}
