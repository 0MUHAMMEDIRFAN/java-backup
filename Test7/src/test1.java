import java.util.Scanner;

public class test1 {

	public static void main(String ar[]) {
		
		
		Scanner s=new Scanner(System.in);
		int flag=0;
		System.out.println(" Enter the number");
		int num=s.nextInt();
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				 flag=1;
			
				break;
			
			}
		}
		
		if(flag==0)
			System.out.println(num+"This numer is prime number");
		else
			System.out.println(num+"This numer is not prime number");
	}
}
