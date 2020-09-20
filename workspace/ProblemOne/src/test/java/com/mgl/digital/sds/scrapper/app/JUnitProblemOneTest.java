package com.mgl.digital.sds.scrapper.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.mgl.digital.sds.scrapper.app.service.DefaultNumberService;

/**
 * The Class JUnitProblemOneTest.
 */
public class JUnitProblemOneTest {

	/**
	 * Should pass.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testDefaultNumberService() throws Exception {

		DefaultNumberService numService = new DefaultNumberService();

		List<Integer> expected = new ArrayList<>();
		expected.add(9);
		expected.add(25);
		expected.add(36);
		expected.add(81);
		expected.add(100);
		expected.add(144);
		expected.add(225);
		expected.add(324);
		expected.add(400);
		expected.add(441);

		List<Integer> unexpected = new ArrayList<>();
		unexpected.add(9);
		unexpected.add(25);
		Integer min = 0;
		Integer max = 0;
		Integer limit = 0;

		Map<String, Object> map = numService.getNumbers(min, max, limit);

		// Checks if two primitive types or objects are equal.
		assertEquals(expected, map.get("data"));

		// Assert that expected and actual are not equal.
		assertNotEquals(unexpected, map.get("data"));

		assertTrue(map.get("data") != null);

		assertFalse(map.get("data") == null);

		assertNotNull(map.get("data"));

	}
}
