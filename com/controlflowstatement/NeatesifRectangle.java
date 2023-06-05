package com.controlflowstatement;
import java.util.Scanner;
/**
 * 
 * @author hagunaseelan
 *
 */
public class NeatesifRectangle {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String userName,password ;
		System.out.println("userName :");
		userName = sc.next();
		System.out.println("password:");
		password = sc.next();
		
			if(userName.equals("hemaraj07@gmail.com") && password.equals("hemaraj@123")) {
				System.out.println("welcome " + userName + "!");
			}else {
					System.out.println("invalid username and passwoed");
			}
			sc.close();
	}

}

					
		

		
		
		
		

	


