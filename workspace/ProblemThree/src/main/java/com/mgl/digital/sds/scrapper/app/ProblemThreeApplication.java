package com.mgl.digital.sds.scrapper.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * The Class ProblemThreeApplication.
 */
@SpringBootApplication
public class ProblemThreeApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProblemThreeApplication.class);
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// creates an appropriate ApplicationContext instance and load beans
		SpringApplication.run(ProblemThreeApplication.class, args);
		LOGGER.info("ProblemThreeApplication Started");
	}

}
