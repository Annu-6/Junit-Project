package com.example.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.Numbers;

public class NumbersTest {

	@Test
	public void test() {
		assertFalse(Numbers.allPositive(null));
		assertTrue(Numbers.allPositive(new int[] {})); //empty array
		assertTrue(Numbers.allPositive(new int[] {10, 20, 30}));
		assertTrue(Numbers.allPositive(new int[] {10, 20, 30, 4, 6, 7, 244, 5, 242, 432}));
		assertFalse(Numbers.allPositive(new int[] {-5, 10, 20, 30, 40, 50}));
		assertFalse(Numbers.allPositive(new int[] {10, 20, 0}));
	}
	
	@Test
	public void testCountOdd() {
		assertEquals(0,  Numbers.countOdd(null));
		assertEquals(0, Numbers.countOdd(new int[] {}));
		assertEquals(0, Numbers.countOdd(new int[] {10, 20, 30}));
		assertEquals(3, Numbers.countOdd(new int[] {5, 7, 9}));
		assertEquals(5, Numbers.countOdd(new int[] {-4,-3,-2,-1,0,1,2,3,4,5}));
		assertEquals(4, Numbers.countOdd(new int[] {-5,-7,-9,-11}));
	}
	
	@Test
	public void testCountA() {
		Numbers numbers = new Numbers();
		assertEquals(3, numbers.countA("javabean"));
	}
	
	@Test
	public void testSquare() {
		Numbers numbers = new Numbers();
		assertEquals(25, numbers.square(5));
	}

}
