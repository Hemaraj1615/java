package javafundamental;
import java.util.Scanner;

public class Swapping {
	public static void main(String[]args) {
		Scanner sc =new Scanner (System.in);
		int number1=sc.nextInt();
		int result =(number1%10)*100;
		number1=number1/10;
		result=result+(number1%10)*10;
		number1= number1/10;
		result=result+number1;
		System.out.println(result);
		sc.close();
	}
	
	

}
