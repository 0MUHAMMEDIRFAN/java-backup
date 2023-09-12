import java.util.Scanner;

public class test2 {

	public static void main(String ar[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("for addition : 1 \n for substrction : 2 \n for mulplication : 3 \n For diviosion : 4 \n\t");
		int input=s.nextInt();
		
		if(input==4) {
			System.out.println("enter two numbers");
			int a=s.nextInt();
			int b=s.nextInt();
			Division add=new Division();
			add.Divsn(a, b);
		}else if(input==3) {
			System.out.println("enter two numbers");
			int a=s.nextInt();
			int b=s.nextInt();
			Multiplication mult=new Multiplication();
			mult.multiplication(a, b);
			
		}else if (input==2) {
			System.out.println("enter two numbers");
			int a=s.nextInt();
			int b=s.nextInt();
			Substraction sub=new Substraction();
			sub.sub(a, b);
			
		}else if (input==1) {
			System.out.println("enter two numbers");
			int a=s.nextInt();
			int b=s.nextInt();
			Addition add =new Addition();
			add.add(a, b);
			
			
		}else
			System.out.println("An error occured");
		s.close();
		
		
	}
	
}
