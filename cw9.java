package javamy;

class student{
	private String name;
	private int age;
	private int percentage;
	
	public String getname() {  
	    return name;
	  }
	public int getage() {                    
	    return age;
	  }
	public int getpercentage() {
		return percentage;
	}
	public void setstudent(String name,int age,int percentage) {
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
}

public class studentclass{
	public static void main(String[] args) {
		student s1=new student();
		s1.setstudent("abhi",33,85);
		System.out.println(s1.getname());
		System.out.println(s1.getage());
		System.out.println(s1.getpercentage());
		
		
	}
	
}