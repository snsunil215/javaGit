package com.mgl.digital.sds.scrapper.app;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mgl.digital.sds.scrapper.app.service.YourTargetNumberService;

/**
 * The Class ProblemTwoApplication.
 */
@SpringBootApplication
public class ProblemTwoApplication {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(ProblemTwoApplication.class);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProblemTwoApplication.class, args);
		int arr[] = { 0, 29, 10, 8, 19, 2 };
		int target = 37;

		YourTargetNumberService numserv = new YourTargetNumberService();
		List<Integer> result = new ArrayList<>();
		for (int element : numserv.indices(arr, target)) {
			result.add(Integer.valueOf(element));
		}
		LOGGER.info("The indexes are: {}", result);
	}

}
