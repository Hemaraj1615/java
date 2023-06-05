package javafundamental; 
import java.util.Scanner;

public class Lastdigitofn {

		 public static void main (String[]arg) {

		 Scanner read=new Scanner(System.in);

		 int number=read.nextInt();

		 int result=(number%10);

		 System.out.println(result);

		 read.close();

		 }

		}




