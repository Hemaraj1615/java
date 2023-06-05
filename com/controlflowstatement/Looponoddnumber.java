package com.controlflowstatement;
import java.util.Scanner;
/**
 * forloop on odd number
 * @author hagunaseelan
 * @since 31/05/2023
 */
public class Looponoddnumber {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	for (int counter =1 ; counter <= H ;counter++) {
		if(( counter %4 == 0) && ( counter %2 ==0)){
			System.out.println(counter + "");
			sc.close();
			
		}
	}

	}

}
