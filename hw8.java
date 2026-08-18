package javamy;
import java.util.Scanner;

abstract class ride{
	 abstract void  calculatefair();
	
	void ridetype() {
		System.out.println("generic ride");
	}
	
}
class autoride extends ride{
	 void calculatefair(int a) {
		System.out.println("total fair is   " +(a*10));
    
	}
	public void ridetype() {
		System.out.println("auto ride");
	}
	@Override
	void calculatefair() {
		// TODO Auto-generated method stub
		
	}
}
class carride extends ride{
	public void calculatefair(int a) {
		 System.out.println("total fair is  "+(a*20));
	}
	public void ridetype() {
		System.out.println("car ride");
	}
	@Override
	void calculatefair() {
		// TODO Auto-generated method stub
		
	}
}

public class bookingapp{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("choose ride");
		String r =input.nextLine();
		System.out.println("enter distance");
		int d =input.nextInt();
		
		autoride au =new autoride();
		carride cr=new carride();
		
		if (r.equals("auto")) {
			au.calculatefair(d);
			au.ridetype();
			
		}
		else if (r.equals("car")) {
			cr.calculatefair(d);
			cr.ridetype();
		}
		
		
		
	}
}