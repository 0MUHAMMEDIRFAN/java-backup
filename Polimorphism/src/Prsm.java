public class Prsm {

	// Polimorphism
	//methode over loading
	
	void hello() {
		
		System.out.println("hello");
		
	}
	void hello(int a) {
		
		System.out.println(a);	
	}
	
	public static void main(String[] args) {
		
		Prsm p=new Prsm();
		p.hello();
		
	}
}
