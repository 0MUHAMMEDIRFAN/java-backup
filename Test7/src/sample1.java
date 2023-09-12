
public class sample1 {

	public static void main(String ar[]) {
		
		sample2 s=new sample2();
		sample2 s1=new sample2();
		
		s.a=100;
		s.b=300;
		
		int sum= s.a+s.b;
		s.sum(sum);
	
		s1.sum(sum);
	}
}
