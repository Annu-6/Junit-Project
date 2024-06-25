package com.example.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {

	// timeout is 100 millisecond
	@Test(timeout = 100)
	public void testPerformance() {
		// test performance of 1Million arrays getting sorted simultaneously
		for (int i=0; i<1000000; i++) {
			Arrays.sort(new int[] {i, i-1, i+1});
		}
	}

}
