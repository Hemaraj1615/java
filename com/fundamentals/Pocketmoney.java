package com.fundamentals;
import java.util.Scanner;
public class Pocketmoney {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int pocketmoney = sc.nextInt();
		int apple = sc.nextInt();
		int bananna = sc.nextInt();
		int z = apple+bananna ;
		int magicmachine = pocketmoney-z ;
		int home =magicmachine*3;
		System.out.println(z+"" +home+""+ magicmachine);
		sc.close();
		
	}
	
	
}
	
			
  


