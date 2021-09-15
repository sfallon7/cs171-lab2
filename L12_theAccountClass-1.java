//Sean Fallon
//COMP-171
//Fall-19
//Lab 12

import java.util.Date;

public class theAccountClass {

	public static void main(String[] args) {
		
		Account account = new Account(1222,20000);
		
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.print(
				"The balance is: " + account.getBalance() + "\n" +
				"The monthly interest is: " + account.getMonthlyInterest() + "\n" + 
				"The monthly interest rate is: " + account.getMonthlyInterestRate() + "\n" +
				"The annual interest rate is: " + account.getAnnualInterestRate()
		);
	}
}

class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	public Account() {
		dateCreated = new java.util.Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
		
	public int getId() {
		return this.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public String getDateCreated() {
		return this.dateCreated.toString();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate/12)/100;
	}
	
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();	
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
