import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	
	//First Name Validation
	public void nameValidator() {
		String pattern= "^[A-Z][a-z]{2,}$";
		System.out.println("Enter the First Name:");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		if(name.matches(pattern)) {
			System.out.println("Valid First Name");
		}
			else {
				System.out.println("Invalid First Name");
				nameValidator();
			}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to User Registration Problem");
		
		UserRegistration user=new UserRegistration();
		user.nameValidator();

	}

}
