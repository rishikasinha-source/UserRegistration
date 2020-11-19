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
	
	//Last Name Validation
	public void nameValidator1() {
		String pattern= "^[A-Z][a-z]{2,}$";
		System.out.println("Enter the Last Name:");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		if(name.matches(pattern)) {
			System.out.println("Valid Last Name");
		}
			else {
				System.out.println("Invalid Last Name");
				nameValidator1();
			}
			
		}
	
	// Email Validation
	
	public void emailValidator() {
		String pattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2})*$";
		System.out.println("Enter the Email Id:");
		Scanner scanner=new Scanner(System.in);
		String email=scanner.next();
		if(email.matches(pattern)) {
			System.out.println("Valid Email Id");
		}
		else {
			System.out.println("Invalid Email Id");
			emailValidator();
		}
	}
	
	// Mobile Format
	
	public void mobileNumberValidator() {
		 String pattern = "^([\\+]?91)[6-9]{1}[0-9]{9}$";
		 System.out.println("Enter the Mobile Format");
		 Scanner scanner=new Scanner(System.in);
		String mobileNumber=scanner.next();
		if(mobileNumber.matches(pattern)) {
			System.out.println("Valid Mobile Format");
		}
		else {
			System.out.println("Invalid Mobile Format");
			mobileNumberValidator();
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to User Registration Problem");
		
		UserRegistration user=new UserRegistration();
		user.nameValidator();
		user.nameValidator1();
		user.emailValidator();
		user.mobileNumberValidator();

	}

}
