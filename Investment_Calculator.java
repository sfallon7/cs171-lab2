//Sean Fallon
//COMP-171
//Fall-19
//Lab 2

import java.util.Scanner;

public class Investment_Calculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double investmentAmount;
		double numberOfYears;
		double futureInvestmentValue;
		double monthlyInterestRate;
		double annualInterestRate;
		
		System.out.print("Enter investment amount: ");
		investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		annualInterestRate = input.nextDouble();
		monthlyInterestRate = annualInterestRate / 1200;
		
		System.out.print("Enter number of years: ");
		numberOfYears = input.nextDouble();
				
		futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, (numberOfYears*12));
		
		System.out.print("Accumulated value is $");
		System.out.printf("%,.2f", futureInvestmentValue);

	}
}
