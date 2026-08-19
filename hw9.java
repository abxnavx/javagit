package javamy;

class employe{
	private String name;
	private int numid;
	private String dept;
	private double salary;
	
	
	public String getname() {
		return name;
		
	}
	public int getnumid() {
		return numid;
	}
	public String getdept() {
		return dept;
	}
	public double getsalary() {
		return salary;
	}
	
	public void setemploye(String name,int numid,String dept,double salary) {
		this.name=name;
		this.numid=numid;
		this.dept=dept;
		this.salary=salary;
	}
}




public class employetest{
	public static void main(String[] args) {
		employe e1=new employe();
		employe e2=new employe();
		e1.setemploye("abhi",100,"cse",45000d);
		System.out.println(e1.getname());
		System.out.println(e1.getnumid());
		System.out.println(e1.getdept());
		System.out.println(e1.getsalary());
		e2.setemploye("ram",200,"cse",60000d);
		System.out.println(e2.getname());
		System.out.print(e2.getnumid());
		System.out.print(e2.getdept());
		System.out.print(e2.getsalary());
	}
}