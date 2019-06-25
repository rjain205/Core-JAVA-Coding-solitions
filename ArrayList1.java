package com.he;
import java.util.*;

public class ArrayList1 {

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		ArrayList <Integer> arr= new ArrayList<Integer> (n);
		
	    for(int i=0;i<n;i++)
	    {   
	    	
	    	
	    	arr.add(sc.nextInt());
	    }
	    System.out.println(arr);
	}
}
