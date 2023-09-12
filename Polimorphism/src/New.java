
public class New extends old{
	
	New(){
		
		System.out.println("New()");
	}

	New(int a){
		super(a);
		
		System.out.println("New (int a)");
		
	}
	
	public static void main(String[] args) {
		
		New n=new New(9);
		
	}
}
