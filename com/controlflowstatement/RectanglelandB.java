package com.controlflowstatement;
import java.util.Scanner;
/**
 * rectangle
 * @author hagunaseelan
 * @since 31-05-2023
 */
 public class RectanglelandB {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l= sc.nextInt();
		int b = sc.nextInt();
		int area = l*b;
		int perimeter = 2*(l+b);
		if(area>perimeter) {
			System.out.println("area is greater than perimeter");
		}
		else {
			System.out.println("area of rectangle is lesser");
		}
		

	}

}
