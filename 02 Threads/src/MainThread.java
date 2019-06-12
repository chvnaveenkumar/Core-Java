import java.util.Scanner;

public class MainThread {

	public static void main(String args[]) throws InterruptedException {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Boolean check = true;
		while(check) {
		System.out.println("\n Choose One of the Option below: \n 1. Addition \n 2. Subtraction \n 3. Multiplication");
		if(sc.hasNext()) {
			choice = sc.nextInt();
		}
		
		System.out.println("your choice: "+ choice);
		switch(choice) {
		case 1: AddThread s = new AddThread();
				s.start();
				s.sleep(1000);
				break;
		case 2: SubThread sub = new SubThread();
				sub.start();
				sub.join();
				break;
		case 3: MulThread mul = new MulThread();
				mul.start();
				mul.join();
				break;
		default: check = false;
				 break;
		}
	 }
	}
}
