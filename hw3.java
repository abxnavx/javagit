package registration;
import java.util.Scanner;

public class localschool{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	   String admin="A";
	   String student="S";
	   String guest="G";
	   
	   System.out.println("select your user code.....");
	   String u1=input.nextLine();
	   
	   
	   
	   
	   
	   if(u1.equals(admin)) {
		   
		   System.out.println(" type password   ");
		   int pass=input.nextInt();
		   System.out.println("conform role ID...");
		   int rid=input.nextInt();
		   
		   if(pass==1234 && rid==1) {
			   System.out.println("Welcome Admin. Full access granted....");
			   
			   
		   }else {
			   System.out.println("invalid credentials or role.");
			   
		   }
	   } 
	   
	   else if(u1.equals(student)) {
		   
		   System.out.println(" type password   ");
		   int pass=input.nextInt();
		   System.out.println("conform role ID...");
		   int rid=input.nextInt();
		   
		   if(pass==1111 && rid==2) {
			   System.out.println("Welcome Student. Limited access granted");
			   
			    }
		   else {
			   System.out.println("invalid credentials or role.");
			   
		   }
	   }
	   
	   
	   
	   else if(u1.equals(guest)) {
		   System.out.println("Welcome Guest. View-only access.");
	   }
	   
	   
	   
	   else {
		   System.out.println("Invalid credentials or role.");
	   }
	   
	   
	  

	   }
	   
	}
