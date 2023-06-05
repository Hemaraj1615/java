package com.arrays;
import java.util.Scanner;
/**
 * number search
 * @author hagunaseelan
 * @since 1/6/2023
 */
 public class NumberSearch {
  public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
       System.out.println("enter the no you want to search:");
         int search=read.nextInt();
         int a[]=new int[25];
          System.out.println("enter array values:");
            for(int i=0;i<25;i++) {
		 a[i]=read.nextInt();
		 }
		 int count=0;
		 for(int i=0;i<a.length;i++) {
		 if(a[i]==search) {
		 count++;
		 System.out.println("number is present");
		 }
		 }
		 System.out.println(count);
		 read.close();
		 }
 }

 
 

	


