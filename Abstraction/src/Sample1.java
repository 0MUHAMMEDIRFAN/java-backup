
public class Sample1 implements Hi {
	
	 public void onText(String text) {
		
		 System.out.println(text);
		
	}
	 
	 Sample1() {
		 
		 TextScanner1 t=new TextScanner1(this);
		 t.scan();
	 }

	 public static void main(String[] args) {
		
		new Sample1();
		 
	}
	
	
}
