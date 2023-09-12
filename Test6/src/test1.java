import java.util.Scanner;

public class test1 {

	public static void main(String ar[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		char[] array=s.next().toCharArray();
		int flag=0;
		System.out.println(array);
		for(int i=0;i<array.length;i++) {
			
			if(array[i]!=array[array.length-1-i]) {
				flag=1;
				System.out.println("this is not palindrome");
				break;
				
			}
		}
		if(flag==0) {
			System.out.println("this is palindrome");
		}

	}
}
