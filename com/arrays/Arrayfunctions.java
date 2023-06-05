package com.arrays;

public class Arrayfunctions {

	public static void main(String[] args) {
		int a [] = {12,45,34,78,89} ;
		System.out.println(" Array elements");
		// for loop
		for(int i= 0; i<a.length ; i++) {
		if(a[i] %2 == 0)
		System.out.print(a[i] + "");
		}
		// for rach loop
		System.out.println("/n");
		for(int value : a) {
			if (value % 2 == 0)
				System.out.println(value + "");
		}
		
		int sum = 0 ;
		System.out.println("\n sum of array elements");
		for ( int data : a) {
			sum = sum + data;
		}
		System.out.println("\n\nSUM:" + sum +"AVERAGE:" + (sum/a.length));
	     int average = (sum/a.length);
	     System.out.println("");
	     for (int data :a) {
	    	 if(data > average) 
	    		 if(data > average)
	    System.out.print(data + "")	;
	    	 }
	}
}
	    	 
	     
	   


