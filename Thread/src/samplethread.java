
public class samplethread implements Runnable{
	
	public void run() {
		
		
		for(int i=0;i<10;i++)
		{
			
			System.out.println("count"+i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
