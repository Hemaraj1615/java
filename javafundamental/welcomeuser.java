package javafundamental;
import java.util.Scanner;

public class welcomeuser {
public static void main(String [] args) {
	Scanner read = new Scanner(System.in);// creating a scanner object for getting input from the user
	System.out.println("please enter the user name");
	 String userName = read.next();
	System.out.println("hello "+userName+"!!");

	read.close();
	
	
}

}
