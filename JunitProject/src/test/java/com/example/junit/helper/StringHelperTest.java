package com.example.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.example.StringHelper;

public class StringHelperTest {
	
	static StringHelper helper;
	
	@BeforeClass
	public static void before() {
		helper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
//		String actualOutput = helper.truncateAINFirst2Positions("RTAA");
//		String expectedOutput = "RTAA";
//		assertEquals(expectedOutput, actualOutput);
		assertEquals("RTAA", helper.truncateAINFirst2Positions("RTAA"));
		assertEquals("BB", helper.truncateAINFirst2Positions("AABB"));
		assertEquals("BBB", helper.truncateAINFirst2Positions("BABB"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAINFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPositions() {
		assertEquals("CD", helper.truncateAINFirst2Positions("ACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
//		boolean actualOutput = helper.areFirstAndLastTwoCharactersTheSame("BBABB");
//		boolean expectedOutput = true;
//		assertEquals(expectedOutput, actualOutput);
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("RTAA"));
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("AABB"));
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("BBABB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}

}
