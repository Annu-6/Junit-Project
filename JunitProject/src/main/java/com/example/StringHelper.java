package com.example;

import java.util.Arrays;
import java.util.Collections;

public class StringHelper {
	
	public static void main(String[] args) {
		int[] numbers = {12,4,3,1};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		String[] arr = {"practice.annu.org","www.annu.org","code.annu.org"};
		Arrays.sort(arr);
		//sort arr[] in ascending order
		System.out.println(Arrays.toString(arr));
		//sort arr[] in descending order
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * Remove all character 'A' in first 2 positions of tyhe given string.
	 * "ABCD"=> "BCD", "AACD"=>"CD", "BACD"=>"BCD", "AAAA"=>"AA", "MNAA"=>"MNAA
	 */
	public String truncateAINFirst2Positions(String str) {
		if (str.length() <= 2) {
			return str.replaceAll("A", "");
		}
		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);
		
		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}
	
	/*
	 * Check if first two and the last two characters in the string are the same
	 * Hint: substring method. ""=> false
	 * ABCD=> false, ABAB=> true, AB=> true, A=> false
	 */
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {
		if (str.length() <= 1) {
			return false;
		}
		if (str.length() == 2) {
			return true;
		}
		String firstTwoCharacters = str.substring(0, 2);
		String lastTwoCharacters = str.substring(str.length()-2);
		
		return firstTwoCharacters.equals(lastTwoCharacters);
	}
}
