import java.util.Scanner;

public class test1 {

	public static void main(String ar[]) {
		
		System.out.println("Enter a number = ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<11;i++) {
			
			System.out.println(i+" x "+num+" = "+i*num);
			
		}
	}
}
