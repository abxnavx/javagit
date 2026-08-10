package javamy;
import java.util.Scanner;

public class welcomeform {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your first name");
	    String name=input.nextLine();
		
	    System.out.println("enter your age");
		int age=input.nextInt();
		input.close();
		
		System.out.println("welcome to the registration form " +name);
		System.out.print(age);
		
	
			
		}
		
	}

