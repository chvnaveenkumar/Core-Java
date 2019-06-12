import java.util.Scanner;

public class AddThread extends Thread{

	Scanner sc = new Scanner(System.in);	
	private int a;
	private int b;
	@Override
	public void run() {
		System.out.println("Enter First number for sum: ");
		a = sc.nextInt();
		System.out.println("Enter Second number for sum: ");
		b = sc.nextInt();
		
		System.out.println("The sum of two numbers: " + (a+b));
	}	
}

class SubThread extends Thread{

	Scanner sc = new Scanner(System.in);	
	private int a;
	private int b;
	@Override
	public void run() {
		System.out.println("Enter Two number for subtraction: ");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The subraction of two numbers: " + (a-b));
	}	
}


class MulThread extends Thread{

	Scanner sc = new Scanner(System.in);	
	private int a;
	private int b;
	@Override
	public void run() {
		System.out.println("Enter Two number for multiplication: ");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The multiplication of two numbers: " + (a*b));
	}	
}
