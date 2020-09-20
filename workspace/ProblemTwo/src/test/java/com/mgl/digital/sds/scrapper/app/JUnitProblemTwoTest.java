package com.mgl.digital.sds.scrapper.app;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mgl.digital.sds.scrapper.app.service.YourTargetNumberService;
/**
 * The Class JUnitProblemTwoTest.
 */
public class JUnitProblemTwoTest  {
	
	/**
	 * Should pass.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testTargetNumberService() {
		int arr[] = { 0, 29, 10, 8, 19, 2 };
		int target = 37;
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(3);
		List<Integer> unexpected = new ArrayList<>();
		unexpected.add(2);
		unexpected.add(4);
		YourTargetNumberService numService = new YourTargetNumberService();
		List<Integer> actualResult = new ArrayList<>();
		for (int element : numService.indices(arr, target)) {
			actualResult.add(Integer.valueOf(element));
		}
		// Checks if two primitive types or objects are equal.
		assertEquals(expected, actualResult);
		
		// Assert that expected and actual are not equal.
		assertNotEquals(unexpected, actualResult);
		
		assertTrue(!actualResult.isEmpty());
		
		assertFalse(actualResult.isEmpty());
		
		assertNotNull(actualResult);
		
	}
}
