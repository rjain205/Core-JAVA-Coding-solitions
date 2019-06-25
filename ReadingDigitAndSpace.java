package com.he;


import java.util.Scanner;

public class ReadingDigitAndSpace {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String padded = String.format("%-20s", s1);
                String zeros= String.format("%03d",x);
                System.out.println(padded+" "+zeros);

               // System.out.println(StringUtils.rightPad(s1, 10, " ")+""+x);
            }
            System.out.println("================================");

    }
}




