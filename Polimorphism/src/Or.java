//Over riding 
//super
public class Or extends Or2{

	int a;
	void or() {
		System.out.println("base class");
	}
	
	public static void main(String[] args) {
		
		Or o=new Or();
		o.or();
		o.Super();
		o.a=100;
		System.out.println(o.a);
	
		o.Super();
	}
	
	void Super() {
		Or2 o=new Or2();
		System.out.println(super.a);
		super.or();
		
	}
}
