import java.util.Scanner;

public class Test1 {

	public static void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter ypur mark ");
		int mark=s.nextInt();
		if(mark<50)
			System.out.println("failed");
		else
			System.out.println("passed");
	
	}
}
