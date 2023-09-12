import java.util.Scanner;

public class test3 {

	public static void main(String ar[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter three numbers = ");
		int num1=s.nextInt();
		int num2=s.nextInt();
		float num3=s.nextFloat();
		float si=(num1*num2*num3)/100;
		System.out.println(" the simple interest = "+si);
		
	}
}
