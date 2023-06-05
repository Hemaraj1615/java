package com.arrays;
import java.util.Scanner;


public class Incrementvalueofn {

	public static void main(String[] args) {
		int[] b = new int[10];
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i =0; i< n; i++) {
			b[i] = scan.nextInt();
		}
            int sum =0;
            int prod= 0;
            int avg =0;
            for (int i = 5; i<n; i++){
             sum = sum=b[i];
             prod = prod*b[i];
            }
            
            
            


