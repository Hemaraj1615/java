package com.controlflowstatement;
import java.util.Scanner;
/**
 * for sumofoddevennaturalnumbers
 * @author hagunaseelan
 * @since 31/05/2023
 */
public class Sumofoddevennaturalnumber {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);

		int j=0;

		int k=0;

		int number=read.nextInt();

		for(int i=1;i<=number;i++) {

		if(i%2==0)

		j=i+j;

		else

		k=i+k;
		}
		read .close();
		System.out.println(j+","+k);
	}

		
	

	}


