package com.controlflowstatement;

import java.util.Scanner;

/**
 * postivenegativezeros
 * 
 * @author hagunaseelan
 * @since 31/05/2023
 */
public class Postivenegativezeros {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int postive = 0;
		int negative = 0;
		int zero = 0;
		while (true) {
			String value = read.next();
			if (value.equals("y"))
				break;
			else {
				int num1 = Integer.parseInt(value);
				if (num1 > 0) {
					postive++;
				} else if (num1 < 0) {
					negative++;
				} else {
					zero++;
				}
			}

		}

		System.out.println(" count of positive numbers :" + postive);
		System.out.println(" count of negative numbers :" + negative);
		System.out.println(" count of zero :" + zero);
	}
	           
}
