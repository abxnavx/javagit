package javamy;

public class marks{
	public static void main(String[] args) {
		
		int[] mark=new int[5];
		mark[0]=78;
		mark[1]=80;
		mark[2]=95;
		mark[3]=48;
		mark[4]=72;
		
		for(int i=0;i<mark.length;i++)
		if(mark[i]>=90) {
			System.out.println("excellent mark "+mark[i]);
		}else if(mark[i]>=75 && mark[i]<89) {
			System.out.println("good mark "+mark[i]);
		}else if(mark[i]>50 && mark[i]<74) {
			System.out.println("average mark "+mark[i]);
		}else if(mark[i]<50) {
			System.out.println("failed "+mark[i]);
		}
		
			
		
			
				
				
		
	}
}