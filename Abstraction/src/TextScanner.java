
public class TextScanner {

	Hello obj1;
	public TextScanner(Hello obj) {
		
		this.obj1=obj;
		
	}
	
	void scan() {
		//eg : on camera
		
		obj1.onText("scanned text");
		
	}
}
