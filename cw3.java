package javamy;
import java.util.Scanner;

public class trainingportal {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter username");
		String usrname=input.nextLine();
		
		System.out.println("enter password");
		String pass=input.nextLine();
		
		
	String defaultname="admin";
	String depass="java123";
	
	if(usrname.equals(defaultname) && pass.equals(depass)) {
		System.out.println("login successful......");
		
	}
	else {
		System.out.println("login denied.....");
		
	}
		
	}
}