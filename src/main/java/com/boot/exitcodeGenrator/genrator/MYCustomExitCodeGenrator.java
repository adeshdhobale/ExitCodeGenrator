package com.boot.exitcodeGenrator.genrator;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class MYCustomExitCodeGenrator implements ExitCodeGenerator {

	@Override
	public int getExitCode() {
		System.out.println("5055");
		return 5055;
	}

	
}
