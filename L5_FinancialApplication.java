//Sean Fallon
//COMP 171
//Fall 19
//Lab 5

import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		
		//top of table
		System.out.printf("%-17s%-19s%-12s", "Interest Rate", "Monthly Payment", "Total Payment");
		System.out.println("\n");
		
		//interest rate table
		//i = annual interest rate
		for (double i = 5; i <= 8; i += 0.125) {
		
			//convert rate to months	
			double monthlyRate = i / 1200;
		
			//payment formula
			double monthlyPayment = loanAmount * monthlyRate / (1 -1 / Math.pow(1 + monthlyRate, years * 12));
			double total = monthlyPayment * years * 12;
			
			//make string to format
			String s1 = "%";
			
			//output data
			System.out.printf("%-1.3f%s%17.2f%21.2f\n",i, s1, monthlyPayment, total);
		}
	input.close();
	}
}
