package javamy;
import java.util.Scanner;

 class user{
	 void showmessage() {
		 
	 }
	 
	void displayusertype() {
		System.out.println("user type selected");
	}
	
}
 
 class adminuser extends user{
	public void showmessage() {
	 System.out.println("welcome admin");
 }
 }
 class guestuser extends user{
	 public void showmessage() {
	 System.out.println("welcome guest");
 }
 }
 
 public class usertest{
	 public static void main(String[] args) {
		 adminuser a = new adminuser();
		 guestuser g = new guestuser();
		 
		 a.showmessage();
		 g.showmessage();
	 }
 }