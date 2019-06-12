import java.util.Scanner;
import java.util.regex.Pattern;

public class LoginValidation {

	public static void main(String args[]) {
		String username, password;
		boolean validate_username = true;
		boolean validate_password = true;
		Scanner sc = new Scanner(System.in);
		while(validate_username) {
			System.out.print("Enter the user name:");
			username = sc.nextLine();
			boolean b3 = Pattern.matches("^[A-Za-z](?=.*?[#?!@$%^&*-])[A-Za-z0-9].{2,}$", username);
			if(b3 == true) {
				validate_username = false;
			}else {
				System.out.println("User Name is not valid!!");
			}
		}
		while(validate_password) {
			System.out.print("Enter the password:");
			password = sc.nextLine();
			boolean b3 = Pattern.matches("^$", password);
			if(b3 == true) {
				validate_username = false;
			}
		}		
	}
}
