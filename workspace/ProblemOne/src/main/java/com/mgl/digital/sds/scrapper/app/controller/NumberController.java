package com.mgl.digital.sds.scrapper.app.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mgl.digital.sds.scrapper.app.ProblemOneApplication;
import com.mgl.digital.sds.scrapper.app.service.DefaultNumberService;

/**
 * The Class NumberController.
 */
@RestController
public class NumberController {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(ProblemOneApplication.class);

	/** The dns. */
	@Autowired
	private DefaultNumberService dns;

	/**
	 * Numbers.
	 *
	 * @param min   the min
	 * @param max   the max
	 * @param limit the limit
	 * @return the map
	 */
	@RequestMapping("/numbers")
	public Map<String, Object> numbers(@RequestParam("min") Integer min, @RequestParam("max") Integer max,
			@RequestParam("limit") Integer limit) {
		// inject a Number Service and call getNumbers(), and return the result
		LOGGER.info("Calling getNumbers method from DefaultNumberService");
		return dns.getNumbers(min, max, limit);
	}

}