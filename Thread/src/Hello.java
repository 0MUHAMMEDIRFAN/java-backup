
public class Hello {

	
	public static void main(String[] args) {
		
		samplethread ss=new samplethread();
		Thread s=new Thread(ss);
		s.start();
		samplethread sst1 = new samplethread();
		Thread st1=new Thread(sst1);
		st1.start();
		samplethread sst12 = new samplethread();
		Thread st12=new Thread(sst12);
		st12.start();
		samplethread sst13 = new samplethread();
		Thread st13=new Thread(sst13);
		st13.start();
		samplethread sst14 = new samplethread();
		Thread st14=new Thread(sst14);
		st14.start();
		samplethread sst15 = new samplethread();
		Thread st15=new Thread(sst15);
		st15.start();
		samplethread sst16 = new samplethread();
		Thread st16=new Thread(sst16);
		st16.start();
	}
	
}
