package com.he;
import java.text.NumberFormat;
import java.util.*;

public class Currency {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
            Locale l=new Locale("en","IN");
            NumberFormat u=NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat c=NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat f=NumberFormat.getCurrencyInstance(Locale.FRANCE);
            NumberFormat i=NumberFormat.getCurrencyInstance(l);
            
            String us=u.format(payment);
            String india=i.format(payment);
            String china=c.format(payment);
            String france=f.format(payment);
	        // Write your code here.
	        
	        System.out.println("US: " + us);
		
		 System.out.println("India: " + india); 
		 System.out.println("China: " + china);
		 System.out.println("France: " + france);
		 
	    }
	}

