import java.util.Scanner;

public class Test1 {

	public static void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size: ");
		int size=s.nextInt();
		int array1[];
		array1=new int[size];
		System.out.println("enter the values of 1st array");
		
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=s.nextInt();
		}
		
		System.out.println("enter the values of 2nd array");
		int array2[];
		array2=new int[size];
		for(int i=0;i<array2.length;i++)
		{
			array2[i]=s.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			int a=array1[i];
			array1[i]=array2[i];
			array2[i]=a;
			
			System.out.println(array1[i]);
			
		}
		System.out.println("");
		for(int i=0;i<size;i++) {
	
			System.out.println(array2[i]);
			
		
		}
	}
		
}
