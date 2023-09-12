import java.util.Scanner;

public class veruthe {

	public static void main(String ar[]) {
		
		
		Scanner s=new Scanner(System.in);
		int num,flag=0,a=0,b=0;
		System.out.println(" Enter the number");
		int limit=s.nextInt();
		s.close();
		System.out.println(" the prime numbers upto "+limit+" are given below :");
		for(num=1;num<=limit;num++) {
			for(int i=2;i<=num/2;i++) {
				
				if(num%i==0) {
					flag=1;
			
					break;
				}else
					flag=0;
				
			}
			
			if(flag==0) {
				for(a=b;a<b+1;a++) {
				
					if(a%5==0) {
						System.out.println("");
					}
					
				}
				b++;
				System.out.print(num+"\t");
			}
		}
		
		
	}
}
