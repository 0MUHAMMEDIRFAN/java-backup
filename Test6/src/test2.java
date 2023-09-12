import java.util.Scanner;

public class test2 {

	public static void main(String ar[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int i=0;
		int a=0;
		int[][] array1,array2;
		array1=new int[size][size];
		array2=new int[size][size];
		System.out.println("enter the value of array1");
		for(i=0;i<size;i++) {
		
			for(a=0;a<size;a++) {
			
				array1[i][a]=s.nextInt();
			}
		}
		
		System.out.println("enter the value of array2");
		for(i=0;i<size;i++) {
			
			for(a=0;a<size;a++) {
			
				array2[i][a]=s.nextInt();
			}
		}
		System.out.println("THE RESULT IS HERE :");
		for(i=0;i<size;i++) {
			
			for(a=0;a<size;a++) {
			
				array1[i][a]=array1[i][a]+array2[i][a];
				System.out.print(array1[i][a]+" ");
			}
			System.out.println();
		}
		
	}
}
