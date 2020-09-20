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
 * @author Ratnasai
 */
@Service
public class DefaultNumberService implements NumberService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProblemOneApplication.class);

	/**
	 * @return the numbers
	 */
	@Override
	public Map<String, Object> getNumbers() {
		LOGGER.info("Entering the getNumbers method");
		Map<String, Object> response = new HashMap<>();
		long startTime = System.nanoTime();

		long endTime = 0;

		IntStream result = IntStream.rangeClosed(1, 1000).filter(n -> (n % 3 == 0 || n % 5 == 0)).map(n -> n * n).limit(10);

		response.put("data", result.boxed().collect(Collectors.toList()));
		endTime = System.nanoTime() - startTime;
		response.put("time_taken", endTime);
		LOGGER.info("Exiting the getNumbers method");
		return response;
	}

}