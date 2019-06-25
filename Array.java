package com.he;

import java.util.*;
class Array {
	
	static void reverse(int [] a, int n)
	{
		int [] b=new int[n];
		int j=n;
		for(int i=0;i<n;i++) {
			b[j-1]=a[i];
		    j=j-1;
		}

	
	for(int k=0;k<n;k++)
	{
		System.out.println(b[k]);
	}
	}
    public static void main(String args[] ) throws Exception {
       Scanner kb=new Scanner(System.in);
       System.out.println("How many elements u want to enter?");
       int n = kb.nextInt();
       int a[]=new int[n];
       for(int q=0;q<n;q++) 
       {
    	    a[q]=kb.nextInt();
       }
        
        reverse(a, a.length);
    
}}
