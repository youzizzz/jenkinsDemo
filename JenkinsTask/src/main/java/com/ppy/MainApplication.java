package com.ppy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
	
	 private final static Logger logger = LoggerFactory.getLogger(MainApplication.class);
	 
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplication.class, args);
	}

}
