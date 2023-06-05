package javafundamental;
/**
 * cube 
 * @hemaraj
 * 30-05-2023
 * 
 * 
 */
import java.util.Scanner;
public class Cube {
	public static void main(String[] args) {
            Scanner read=new Scanner(System.in);
           System.out.println("Enter the input value :");
		    int cube=read.nextInt();
           System.out.println("the cube value of cube :"+cube*cube*cube);//cube of the value 
		   read.close();
	}
	

}
