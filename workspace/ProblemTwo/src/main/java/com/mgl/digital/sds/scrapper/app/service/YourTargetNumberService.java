package com.mgl.digital.sds.scrapper.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class YourTargetNumberService.
 * @author Ratnasai
 */
public class YourTargetNumberService implements TargetNumberService {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(YourTargetNumberService.class);

	/**
	 * Indices.
	 *
	 * @param arr    the arr
	 * @param target the target
	 * @return the int[]
	 */
	public int[] indices(int[] arr, int target) {
		LOGGER.info("Entering the indices method");
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == target) {
					flag = true;
					return new int[] { i, j };
				}
			}
		}
		if (!flag) {
			throw new IllegalStateException("wrong input");
		}
		LOGGER.info("Exiting the indices method");
		return null;
	}
}
