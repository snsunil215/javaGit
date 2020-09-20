/*
 * 
 */
package com.mgl.digital.sds.scrapper.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * The Class CountYZTest.
 */
public class CountYZTest {

	/**
	 * Count YZ.
	 *
	 * @param str the str
	 * @return the int
	 */
	public int countYZ(String str) {
		Pattern regex = Pattern.compile("[yz](?!\\p{L})", Pattern.CASE_INSENSITIVE);
		Matcher m = regex.matcher(str);
		int count = 0;
		while (m.find())
			count++;
		return count;
	}

	/**
	 * Should pass.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void shouldPass() throws Exception {
		assertEquals(2, countYZ("fez day"));
		assertEquals(2, countYZ("day fez"));
		assertEquals(1, countYZ("day yak"));
		assertEquals(1, countYZ("day:yak"));
		assertEquals(2, countYZ("!!day--yaz!!"));
		assertEquals(2, countYZ("DAY abc XYZ"));
		assertEquals(3, countYZ("aaz yyz my"));
		assertEquals(2, countYZ("y2bz"));
		assertEquals(0, countYZ("zxyx"));
	}
}