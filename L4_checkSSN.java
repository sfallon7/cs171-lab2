//Sean Fallon
//COMP 171
//Fall 19
//Lab 4

import java.util.Scanner;

public class checkSSN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String ssn;
		boolean isValid;
		
		System.out.print("Enter a SSN: ");
		
		ssn = input.nextLine();
		
		isValid = 
		  (ssn.length() == 11) &&
		  (Character.isDigit(ssn.charAt(0))) &&
		  (Character.isDigit(ssn.charAt(1))) &&
		  (Character.isDigit(ssn.charAt(2))) &&
		  (ssn.charAt(3) == '-') &&
		  (Character.isDigit(ssn.charAt(4))) &&
		  (Character.isDigit(ssn.charAt(5))) &&
		  (ssn.charAt(6) == '-') &&
		  (Character.isDigit(ssn.charAt(7))) &&
		  (Character.isDigit(ssn.charAt(8))) &&
		  (Character.isDigit(ssn.charAt(9))) &&
		  (Character.isDigit(ssn.charAt(10)));

		if(isValid == true) {
			System.out.print(ssn + " is a valid social security number");	
		}
		
		else {
			System.out.print(ssn + " is an invalid social security number");
		}
		input.close();
	}
}
