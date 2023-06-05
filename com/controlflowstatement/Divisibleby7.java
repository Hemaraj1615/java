package com.controlflowstatement;
import java.util.Scanner;
/**
 * divisible by 7
 * @author hagunaseelan
 * @since 31-05-2023
 */
 public class Divisibleby7 {
   public static void main(String[] args) {
	   int num;
	   Scanner sc = new Scanner(System.in);
	   //enter the input value to the user
	   int a = sc.nextInt();
	   if(a >0 && a !=0) {
		   if (a % 7 ==0 );
		   System.out.println(a + "is divisible by 7");
	   }else {
		   System.out.println("number should not divisble by seven");
	   sc.close();
	   }
	}
}
