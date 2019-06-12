
public class DSBase {

	static int i = 10;
	int j = 20;
	static {
		System.out.println("Static Variable i in static block:" + i);
		DSBase dsbase = new DSBase();

		System.out.println("Instance Variable j in static block:" + dsbase.j);

	}
	public static void main(String args[]) {
		System.out.println("Static variable i :"+ i);
		DSBase dsbase = new DSBase();
		System.out.println("Instance variable j :"+ dsbase.j);

	}
}
