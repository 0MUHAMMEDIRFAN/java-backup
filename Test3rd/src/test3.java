import java.util.Scanner;

public class test3 {

	public static void main(String ar[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter your week number(1,2,3,4,5,6,7) : ");
		int num=s.nextInt();
		String a;
		switch(num) {
		case 1: a="sunday";
			break;
		case 2: a="monday";
		 break;
		case 3 :a="tuesday";
		break;
		case 4 :a="wednesday";
		break;
		case 5 :a="thursday";
		break;
		case 6 :a="friday";
		break;
		case 7 :a="saturday";
		break;
		default : a="wrong";
		}
		
		System.out.println(a);
	}
}
