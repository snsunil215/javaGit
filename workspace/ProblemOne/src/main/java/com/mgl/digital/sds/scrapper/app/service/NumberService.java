package com.mgl.digital.sds.scrapper.app.service;

import java.util.Map;

/**
 * The Interface NumberService.
 */
public interface NumberService {

	/**
	 * Gets the numbers.
	 *
	 * @param min   the min
	 * @param max   the max
	 * @param limit the limit
	 * @return the numbers
	 */
	Map<String, Object> getNumbers(Integer min, Integer max, Integer limit);
}