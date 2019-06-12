import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Arrays {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[] = {6,10,20,30,31,38,47,121,496,371};
		
		Predicate<Integer> p = (x) -> x%2 == 0;
		BiPredicate<Integer,Integer> p2 = (x,y) -> x%y == 0;
		
		Consumer<Integer> even = (num) -> {
			if(p.test(num)) {
				System.out.println("The number "+ num +" is even number. ");
			}
		};
		
		Consumer<Integer> odd = (num) -> {
			if(!p.test(num)) {
				System.out.println("The number "+ num +" is odd number. ");
			}
		};
		
		//Print list of even/odd numbers
		System.out.println("**** Print even/odd number ****");
		for(int i=0;i<arr.length;i++) {
			even.accept(arr[i]);
		    odd.accept(arr[i]);
		}
		
		Predicate<Integer> check_prime_or_not = (num) -> {
			for (int j = 2; j<= num/j; j++)
	        {
	            if (p2.test(num, j))
	            	return false;
	        }
			return true;
		};

		System.out.println("\n\n**** Print prime number or not ****");
		for(int i=0;i<arr.length;i++) {	
			if(check_prime_or_not.test(arr[i]))
            System.out.println("The number "+ arr[i]+" is not a prime number");
			else
		    System.out.println("The number "+ arr[i]+" is a prime number");
		}

		Predicate<Integer> perfect_or_not = (n)->{
			int num = n;
			int sum = 0;
			for(int k=1;k<=(num/2);k++) {
				if(p2.test(num,k)) {
					sum+=k;
				}
			}
			return sum == n;
		};
		System.out.println("\n\n **Given number is perfect or not.**");
		for(int i=0;i<arr.length;i++) {	
		if(perfect_or_not.test(arr[i])) {
			System.out.println("The number "+ arr[i]+" is perfect number.");
		}else {
			System.out.println("The number "+ arr[i]+" is not a perfect number.");			
		}
		}
		
		System.out.println("\n\n **Given number is armstrong or not.**");
		for(int i=0;i<arr.length;i++) {	
		int num = arr[i];
		int sum = 0;
		while(num>0) {
			int value = num%10;
			sum+= Math.pow(value, 3);
			num = num/10;
		}
		if(sum == arr[i]) {
			System.out.println("The number "+ arr[i]+" is armstrong number.");
		}else {
			System.out.println("The number "+ arr[i]+" is not a armstrong number.");			
		}
		}
		

		System.out.println("\n\n **Given number is palindrom or not.**");
		for(int i=0;i<arr.length;i++) {	
		int num = arr[i];
		int rev = 0;
		while(num>0) {
			int value = num%10;
			rev= rev * 10 + value;
			num = num/10;
		}
		if(rev == arr[i]) {
			System.out.println("The number "+ arr[i]+" is palindrom number.");
		}else {
			System.out.println("The number "+ arr[i]+" is not a plindrom number.");			
		}
		}	
	}
}
