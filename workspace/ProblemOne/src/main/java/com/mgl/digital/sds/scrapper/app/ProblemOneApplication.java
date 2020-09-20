package com.mgl.digital.sds.scrapper.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Class ProblemOneApplication.
 */
@SpringBootApplication
public class ProblemOneApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProblemOneApplication.class);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// creates an appropriate ApplicationContext instance and load beans
		SpringApplication.run(ProblemOneApplication.class, args);
		LOGGER.info("ProblemOneApplication Started");
	}

}
