package com.mgl.digital.sds.scrapper.app.service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mgl.digital.sds.scrapper.app.ProblemOneApplication;

/**
 * The Class DefaultNumberService.
 * 
 * @author Ratnasai
 */
@Service
public class DefaultNumberService implements NumberService {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(ProblemOneApplication.class);

	/**
	 * Gets the numbers.
	 *
	 * @param min the min
	 * @param max the max
	 * @param limit the limit
	 * @return the numbers
	 */
	@Override
	public Map<String, Object> getNumbers(Integer min, Integer max, Integer limit) {
		LOGGER.info("Entering the getNumbers method");
		Map<String, Object> response = new HashMap<>();
		long startTime = System.nanoTime();// Capture the starting time
		if (min < max) {

			// Intstream rangeClosed method accepts the numbers 1 to 1000 and filter, map
			// are used
			// to perform intermediate operations and limits the result to first 10 elements
			// as specified.
			IntStream result = IntStream.rangeClosed(min, max).filter(n -> (n % 3 == 0 || n % 5 == 0)).map(n -> n * n)
					.limit(limit);

			response.put("data", result.boxed().collect(Collectors.toList()));
			// calculate the time taken by the method to perform the operation

		} else {
			response.put("dataError", "Please provide a valid min and max values");
		}
		long endTime = System.nanoTime() - startTime;
		response.put("time_taken", endTime);
		LOGGER.info("Exiting the getNumbers method");

		return response;
	}
}