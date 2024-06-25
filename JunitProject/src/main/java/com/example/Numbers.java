package com.example;

public class Numbers {
	/**
	 * @param data
	 * @return true if all items of data are positive (more than 0).
	 * false otherwise
	 * return false if array is null
	 * return true is array is empty
	 */
	public static boolean allPositive(int[] data) {
		if (data == null) {
			return false;
		}
		if (data.length == 0) {
			return true;
		}
		for (int i=0; i<data.length; i++) {
			if (data[i] <= 0) {
				return false;
			}
		}
		return true;
	}
	/**
	 * @param data
	 * @return number of odd (not divisible by 2) numbers in the array
	 * return 0 if array is null or empty
	 */
	public static int countOdd(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		}
		int counter = 0;
		for(int i=0; i<data.length; i++) {
			if (data[i] % 2 != 0) {
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * @param x
	 * @return integer square number of x
	 */
	public int square(int x) {
		return x * x;
	}
	
	/**
	 * @param word
	 * @return number of times character'a' or 'A' occurred in String 'word'
	 */
	public int countA(String word) {
		int count = 0;
		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i)=='a' || word.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}

}
