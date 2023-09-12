import java.util.Scanner;

public class test3 {

	public static void main(String ar[]) {
		
		Scanner s=new Scanner(System.in);
		int size=5,i,array[];
		array=new int[5];
		System.out.println("enter the values");
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
			
		}
		
		for(i=0;i<size;i++)
		{
			for(int a=i+1;a<size;a++) {
				if(array[i]<array[a]) {
					int temp=array[i];
					array[i]=array[a];
					array[a]=temp;
				}
			}
		}
		
		for(i=0;i<size;i++)
			System.out.println(array[i]);
		
	}
}
