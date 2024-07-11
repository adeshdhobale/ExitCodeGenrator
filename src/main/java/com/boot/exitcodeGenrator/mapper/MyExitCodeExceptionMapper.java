package com.boot.exitcodeGenrator.mapper;

import java.io.IOException;

import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.stereotype.Component;

@Component
public class MyExitCodeExceptionMapper  implements ExitCodeExceptionMapper{

	@Override
	public int getExitCode(Throwable exception) {
		if (exception instanceof IOException) {
			return 99;
			
		}
		return 9;
	}

}
