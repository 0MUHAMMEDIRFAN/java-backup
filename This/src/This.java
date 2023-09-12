
public class This {

	int a;
	int b;

	static String c="finish";
	
	This(int a,int b){
		
		this.a=a;
		this.b=b;
		System.out.println(a+"\n"+b);
	}
	
	public static void main(String[] args) {
		
		This t=new This(10,20);
		t.a=t.a+1;
		t.b=t.b+1;
		System.out.println(t.a+"\n"+t.b);
		System.out.println(c);
	
		t.dbt();
		
		
	}
	
	
	void dbt() {
		
		int a=this.a;
		int b=this.b;
		
		System.out.println(a+"\n"+b);
		
	}
	
	void scnd() {
		System.out.println(a+"\n"+b);
		
	}
	
}
