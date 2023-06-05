package com.controlflowstatement;
import java.util.Scanner;
/**
 * @sumof odeven natural numbers
 * @author hagunaseelan
 * @since 31/05/2023
 */
public class Sumofevennaturalnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum = 0;
		for ( int i =1 ; i<T ; i++) {
		   if (i %2 ==0) {
           sum = sum+i;
		   }
		}
      System.out.println(sum);
      sc.close();
	}

}
