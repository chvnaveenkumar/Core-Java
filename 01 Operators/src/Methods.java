
public class Methods {

	private static int a = 10;
	private static int b = 20;
	
	public void add() {
		System.out.println("The sum of a+b: " + (a+b));
	}
	
	public void add(int a, int b) {
		System.out.println("The sum of a+b: " + (a+b));
	}
	
	public int mul() {
		return a*b;
	}
	
	public int mul(int x, int y) {
		return x*y;
	}
	
	public static void sub() {
		System.out.println("The sub of a-b: " + (a-b));
	}
	
	public static void sub(int a, int b) {
		System.out.println("The sub of a-b: " + (a-b));
	}
	
	public static int div() {
		return a/b;
	}
	
	public static int div(int x, int y) {
		return x/y;
	}
	
	public static void main(String args[]) {
	
		Methods m = new Methods();
		m.add();
		m.add(11, 12);
		System.out.println("The mul of a,b: "+m.mul());
		System.out.println("The mul of a,b: "+m.mul(90,2));
		sub();
		sub(5,10);
		System.out.println("The division of a,b:"+div());
		System.out.println("The division of a,b:"+div(17,2));
	
	}
}
