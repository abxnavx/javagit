package javamy;
public class bookstore{
	public static void main(String[] args) {
		int quantity = 3;
		int price = 275;
		double total_amount=(price*quantity);
		
		int discount=10;
		double newdiscount=(discount/100);
		System.out.println("discount is"+newdiscount);
		
		
		double final_bill=(total_amount-(total_amount*newdiscount));
		System.out.println("the final bill is "+final_bill);
		System.out.println("the original price "+total_amount);
				
	}
}
	