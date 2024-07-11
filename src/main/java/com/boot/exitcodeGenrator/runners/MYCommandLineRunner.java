package com.boot.exitcodeGenrator.runners;

import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MYCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
	System.out.println("Command line runner has been invoked");
	//throw new IOException();
		
	}
	

}
