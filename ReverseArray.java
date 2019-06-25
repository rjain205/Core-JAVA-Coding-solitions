package com.he;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
	
	static void reverseArray(Integer[] arr) {
	Collections.reverse(Arrays.asList(arr));
	System.out.println(Arrays.asList(arr));
	

}
	public static void main(String [] args)
	{
		Integer [] a= {1,8,7,9,5};
	reverseArray(a);
	}
}