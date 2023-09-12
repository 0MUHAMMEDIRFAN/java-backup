import java.util.Scanner;

public class avg {

	public static void main(String ar[]) {
		Scanner i=new Scanner(System.in);
		System.out.println("give three numbers");
		int num1=i.nextInt();
		int num2=i.nextInt();
		int num3=i.nextInt();
		int avg=(num1+num2+num3)/3;
		System.out.println(num1+","+num2+","+num3+"\navarage is = "+avg);
	}
}