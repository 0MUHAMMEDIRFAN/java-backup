import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	
	JFrame jf=new JFrame();
	JLabel label;
	JLabel minilabel;
	
	JButton seven;
	JButton eight;
	JButton nine;
	JButton four;
	JButton five;
	JButton six;
	JButton one;
	JButton two;
	JButton three;
	JButton dot;
	JButton zero;
	JButton multiple;
	JButton plus;
	JButton minus;
	JButton division;
	JButton equal;
	JButton clear;
	JButton delete;
	double value1,value2=0;
	String operator;
	String labelText;
	String minilabelText;
	String button;
	int i=0;
	int value3=1;
	int value4=1;
	int first=0;
	double value;
	
	
	Calculator(){
		
		jf.setSize(600,600);
		jf.setLayout(null);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocation(350, 100);
		
		label=new JLabel();
		label.setFont(new Font("", Font.BOLD, 50));
		
		label.setBounds(10, 40, 560, 70);
		label.setOpaque(true);
		jf.add(label);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.black);
		label.setBackground(Color.gray);
		
		minilabel=new JLabel();
		minilabel.setBounds(10, 10, 560, 30);
		minilabel.setOpaque(true);
		jf.add(minilabel);
		minilabel.setHorizontalAlignment(SwingConstants.RIGHT);
		minilabel.setForeground(Color.white);
		minilabel.setBackground(Color.lightGray);
		
		seven=new JButton("7");
		seven.setBounds(20, 120, 90, 90);
		seven.setFont(new Font("",Font.PLAIN, 40));
		jf.add(seven);
		seven.addActionListener(this);
		
		eight=new JButton("8");
		eight.setBounds(120, 120, 90, 90);
		eight.setFont(new Font("",Font.PLAIN, 40));
		jf.add(eight);
		eight.addActionListener(this);
		
		nine=new JButton("9");
		nine.setBounds(220, 120, 90, 90);
		nine.setFont(new Font("",Font.PLAIN, 40));
		jf.add(nine);
		nine.addActionListener(this);
		
		four=new JButton("4");
		four.setBounds(20, 220, 90, 90);
		four.setFont(new Font("",Font.PLAIN, 40));
		jf.add(four);
		four.addActionListener(this);
		
		five=new JButton("5");
		five.setBounds(120, 220, 90, 90);
		five.setFont(new Font("",Font.PLAIN, 40));
		jf.add(five);
		five.addActionListener(this);
		
		six=new JButton("6");
		six.setBounds(220, 220, 90, 90);
		six.setFont(new Font("",Font.PLAIN, 40));
		jf.add(six);
		six.addActionListener(this);
		
		one=new JButton("1");
		one.setBounds(20, 320, 90, 90);
		one.setFont(new Font("",Font.PLAIN, 40));
		jf.add(one);
		one.addActionListener(this);
		
		two=new JButton("2");
		two.setBounds(120, 320, 90, 90);
		two.setFont(new Font("",Font.PLAIN, 40));
		jf.add(two);
		two.addActionListener(this);
		
		three=new JButton("3");
		three.setBounds(220, 320, 90, 90);
		three.setFont(new Font("",Font.PLAIN, 40));
		jf.add(three);
		three.addActionListener(this);
		
		 dot=new JButton(".");
		dot.setBounds(20, 420, 90, 90);
		dot.setFont(new Font("",Font.PLAIN, 40));
		jf.add(dot);
		dot.addActionListener(this);
		
		 zero=new JButton("0");
		zero.setBounds(120, 420, 90, 90);
		zero.setFont(new Font("",Font.PLAIN, 40));
		jf.add(zero);
		zero.addActionListener(this);
		
		 plus=new JButton("+");
		plus.setBounds(320, 120, 90, 190);
		plus.setBackground(Color.lightGray);
		plus.setFont(new Font("",Font.PLAIN, 40));
		jf.add(plus);
		plus.addActionListener(this);
		
		 minus=new JButton("-");
		minus.setBounds(320, 320, 90, 90);
		minus.setBackground(Color.lightGray);
		minus.setFont(new Font("",Font.PLAIN, 40));
		jf.add(minus);
		minus.addActionListener(this);
		
		multiple=new JButton("x");
		multiple.setBounds(420, 120, 90, 90);
		multiple.setBackground(Color.lightGray);
		multiple.setFont(new Font("",Font.PLAIN, 40));
		jf.add(multiple);
		multiple.addActionListener(this);
		
		division=new JButton("/");
		division.setBounds(420, 220, 90, 90);
		division.setBackground(Color.lightGray);
		division.setFont(new Font("",Font.PLAIN, 40));
		jf.add(division);
		division.addActionListener(this);
		
		equal=new JButton("=");
		equal.setBounds(220, 420, 190, 90);
		equal.setBackground(Color.GRAY);
		equal.setFont(new Font("",Font.PLAIN, 40));
		jf.add(equal);
		equal.addActionListener(this);
		
		clear=new JButton("C");
		clear.setBounds(420, 320, 90, 190);
		clear.setBackground(Color.orange);
		clear.setFont(new Font("",Font.PLAIN, 40));
		jf.add(clear);
		clear.addActionListener(this);
		
		delete=new JButton("D");
		delete.setBounds(520, 120, 50, 390);
		delete.setBackground(Color.BLACK);
		delete.setFont(new Font("",Font.PLAIN, 20));
		jf.add(delete);
		
		
	}
	
	public static void main(String[] args) {
		
		 new Calculator();
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if (value3==0) {
			minilabel.setText("");
			label.setText("");
			value3=1;
		}
		if(value4==0) {
			label.setText("");
			value4=1;
		}
		minilabelText=minilabel.getText();
		labelText=label.getText();
	if(labelText.length()<=7) {	
		if(e.getSource()==seven) {
			button="7";
			Button(button);}
		else if(e.getSource()==eight) {
			button="8";
			Button(button);}
		else if(e.getSource()==nine) {
			button="9";
			Button(button);}
		else if(e.getSource()==four) {
			button="4";
			Button(button);}
		else if(e.getSource()==five) {
			button="5";
			Button(button);}
		else if(e.getSource()==six) {
			button="6";
			Button(button);}
		else if(e.getSource()==one) {
			button="1";
			Button(button);}
		else if(e.getSource()==two) {
			button="2";
			Button(button);}
		else if(e.getSource()==three) {
			button="3";
			Button(button);}
		else if(e.getSource()==dot) {
				
			CheckDot(".",labelText);
				
					if(i==labelText.length()) {

						if(labelText.length()==0) {
							label.setText("0.");
							minilabel.setText(minilabelText+"0.");
						}
						else {
						label.setText(labelText+".");
						minilabel.setText(minilabelText+".");
						}
					}
			}
		else if(e.getSource()==zero) {
			minilabel.setText(minilabelText+"0");
			label.setText(labelText+"0");
		
		}else if(e.getSource()==clear) {
			minilabel.setText("");
			label.setText("");
			value2=0;
			value3=0;
			value=0;
		}
	}
	if(labelText.length()!=0) {
		
		
		if(e.getSource()==plus) {
			
			
			operator="+";
			Check(operator);	
			
		}
		else if(e.getSource()==minus) {

			operator="-";
			Check(operator);
			
		}
		else if(e.getSource()==division) {
			operator="/";
			Check(operator);
			
		}
		else if(e.getSource()==multiple) {
			operator="x";
			Check(operator);
			
		}
		else if(e.getSource()==equal) {
			CheckDot("=", minilabelText);
			if(i==minilabelText.length()) {
				operation();
				labelText=Double.toString(value2);
				label.setText(labelText);
				minilabel.setText(minilabelText+"="+labelText);
				value2=0;
				value3=0;
				value=0;
				
				
			}
			
		}
		
	}
		
		
		
	}
	
	void Button(String button){
		minilabel.setText(minilabelText+button);
		label.setText(labelText+button);
	}

	void operation() {
		switch(operator) { 
		
		case"+":
				value1=Double.parseDouble(labelText);
				value2=value1+value2;
				break;
		case"-":minilabel.setText(minilabelText+"-");
				value1=Double.parseDouble (labelText);
				value2=value1-value2;
				break;
		case"/":minilabel.setText(minilabelText+"/");
				value1=Double.parseDouble(labelText);
				if(value2==0) {
					value2=1;
				}
				if(value==0) {
					value2=value1/value2;
					value=1;
				}else {
					value2=value2/value1;
				}
				break;
		case"x":minilabel.setText(minilabelText+"x");
				value1=Double.parseDouble(labelText);
				if (value2==0) {
					value2=1;
				}
				value2=value1*value2;
				break;
					
		}
		
	}
	
	void Check(String Operator) {
		
		if(minilabelText.charAt(minilabelText.length()-1)!=operator.charAt(0)) {
			
			operation();
			value4=0;
			minilabel.setText(minilabelText+Operator);
		}
		
	}
	
	void CheckDot(String a,String Text) {
		
		i=0;
		for(i=0;i<Text.length();i++)
		{
			if(a.charAt(0)==Text.charAt(i)) {
				label.setText(Text);
				minilabel.setText(minilabelText);
				i=0;
				break;
				
			}
		}
	}
	
}
