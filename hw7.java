package javamy;


interface Vehicle{
    void start();
    void stop();
}
interface fuelbased{
	    void refuel();
}

class Car implements Vehicle,fuelbased{
	
	public void start() {
		System.out.println("car engine started");
	}
	public void stop() {
		System.out.println("car engine stopped");
	}
	public void refuel() {
		System.out.println("car is fueling at station");
	}
	
}

class electricscooty implements Vehicle{
	public void start() {
		System.out.println("electric scooter powered on");
	}
	public void stop() {
		System.out.println("electric scooter powered off");
	}
	
}

public class carRental{
	public static void main(String[] args) {
		Car c=new Car();
		electricscooty s=new electricscooty();
		
		c.start();
		c.stop();
		c.refuel();
		
		s.start();
		s.stop();
	}
}
