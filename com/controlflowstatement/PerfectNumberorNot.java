package com.controlflowstatement;
import java.util.Scanner;

public class PerfectNumberorNot {
	

	    public static void main(String[] arg) {

	                                            
	    	Scanner sc = new Scanner(System.in);// by giving the certain inputs

	        int a = sc.nextInt();

	        int sum = 0;

	        for (int i = 1; i < a; i++) {

	            if (a % i == 0)
	                sum = sum + i;
	        }

	        if (sum == a)

	            System.out.println(a + " Is a perfect number");

	        else

	            System.out.println(a + " Is Not a perfect number");

	        sc.close();

	    }

	}


