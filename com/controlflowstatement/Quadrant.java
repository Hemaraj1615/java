package com.controlflowstatement;
import java.util.Scanner;
 public class Quadrant {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	if (a>0 && b>0) {
    	  System.out.println("the values lies in first quadrant");
    	} else if(a<0 && b>0) {
    	  System.out.println(" the values in second quadrant");
        } else if (a>0 && b<0) {
          System.out.println("the values lies in third quadrant");
        } else if ( a<0 && b<0) {
          System.out.println(" the values lies in fourth quadrant");
        } else if (a>0 && b==0) {
          System.out.println(" the value lies in postive x axis");
        }else if (a<0 && b==0) {
          System.out.println(" the value lies in negative x axis");
        }else if (a==0 && b>0) {
        	System.out.println(" the value lies in postive y axis");
        } else if (a==0 && b<0) {
        	System.out.println( " the value lies in negative y axis");
        } else {
        	System.out.println(" the value lies in orign ");
        }
    	sc.close();
    }
 
 }
 
    	




