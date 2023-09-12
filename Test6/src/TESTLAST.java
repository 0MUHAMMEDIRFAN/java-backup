import java.util.Scanner;

public class TESTLAST {
	public static void main(String ar[]) {
		
		int[] array=new int[5];
		getarray(array);
		display(array);
	}
	
public static int getarray(int getarray1[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values of array");
		for(int i=0;i<3;i++) {
		
			getarray1[i]=s.nextInt();
			
		}
		return 0;
	}
public static void display(int array1[]) {
		for(int i=0;i<3;i++) {
		
			System.out.print(array1[i]+" ");
		
		}
	}
}
