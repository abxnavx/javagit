package javamy;

interface animal{
	void makesound();
	void move();
}

 class bird implements animal{
	public void makesound() {
		System.out.println("chirp");
	}
	public void move() {
		System.out.println("move");
	}
	
}

class dog implements animal{
	public void makesound() {
		System.out.println("bark");
	}
	public void move() {
		System.out.println("run");
	}
	
}

public class zoo{
	public static void main(String[] args) {
		bird b=new bird();
		dog d=new dog();
		
		d.makesound();
		d.move();
		b.makesound();
		b.move();
	}
}