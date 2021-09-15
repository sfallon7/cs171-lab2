//Sean Fallon
//COMP 171
//Fall 19
//Lab 6

import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested: ");
		double investment = input.nextDouble();
		
		System.out.print("Annual interest rate: ");
		double annualRate = input.nextDouble();
		double monthlyRate = annualRate/1200;
		
		System.out.printf("%-10s%12s\n", "Years", "Future Value");
		
		for (int years = 1; years <= 30; years++) {
			System.out.printf("%-13d%8.2f\n", years, futureInvestmentValue(investment, monthlyRate, years));
		
		input.close();	
		}
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
			double futureInvestmentAmount =  investmentAmount * Math.pow(1 + monthlyInterestRate, (years * 12));
			futureInvestmentAmount = (int)(futureInvestmentAmount * 100);
			futureInvestmentAmount = ((double)(futureInvestmentAmount))/100;
			return futureInvestmentAmount;
	}
}
