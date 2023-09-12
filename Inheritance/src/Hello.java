
public class Hello extends Inher{
	
	Hello(){
		System.out.println("ok2");
	}
	
	void hi() {
	
		System.out.println("hello");
	}

	 
		
	public static void main(String[] args) {
		
		Hello h=new Hello();
		h.hi();
		h.in();
		h.num1=10;
		h.num2=1000;
		System.out.println(h.num1);
		System.out.println(h.num2);
	}		
	
	
}
