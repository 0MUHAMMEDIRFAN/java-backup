import java.util.Scanner;

public class test2 {

	
	public static void main(String ar[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter limit");
		int limit=s.nextInt();
		
		for(int i=1;i<=limit;i=i+2)
		System.out.print(" "+i);
		
		
	}
}
