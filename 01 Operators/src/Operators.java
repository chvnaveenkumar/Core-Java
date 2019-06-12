
public class Operators {
	static int a = 10;
	int b;
	public static void main(String args[]) {
		System.out.println("This is java operators example");
		System.out.println("Static variable a:"+ a);
		Operators op = new Operators();
		op.test();
		
		int value=15;  
		System.out.println(value++);  //15 
		System.out.println(++value);  //17
		System.out.println(value--);  //17
		System.out.println(--value);  //15
		System.out.println(value++ + value++ + --value); // 49 - 15+16+16
		
		System.out.println("Additon: "+ (a + value));
		System.out.println("Subtraction: "+ (a - value));
		System.out.println(a*value);//50  
		System.out.println(a/value);//2  
		System.out.println(a%value);//0  
		
		int l = 5;
		int r = 7;
		System.out.println(l<<r);
		System.out.println(l>>r);
		
		//Unary Operator
		int tt=15;  
		int b=-17;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);//-16   
		System.out.println(~b);//16   
		System.out.println(!c);//false  
		System.out.println(!d);//true
		
		int f = 10;
		System.out.println(a<b&&a<f);
		System.out.println(a<b&a<f); 
		System.out.println(a<b||a<f);
		System.out.println(a<b|a<f); 
		
		int t=(a<b)?a:b;  
		System.out.println(t);
		System.out.println(a+=3);
	}
	public void test() {
		System.out.println(a);
	}
}
