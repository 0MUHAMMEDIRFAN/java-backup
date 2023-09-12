
public class Stat {

	int a;
	static int b;

	void print() {
		//int b;
		System.out.println(a);
	}

	public static void main(String ar[]) {
	
		Stat s=new Stat();
	s.a=10;
	s.print();
	Print();
	b=300;
	System.out.println(b);
	
	}
	 static void Print()
	{
		int a=100;
		System.out.println(a);
		b=200;
		System.out.println(b);
		
	}
}
