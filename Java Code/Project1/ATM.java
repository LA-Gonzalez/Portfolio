package project1;

import java.util.*;

public class Question2 {
	
	//main
	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);
		int acctID;
		int selection;
		boolean bLoop = false;
		//create account array with ids 0-9
		Account acct [] = new Account [10];
		
		//create 10 accounts with initial balance of $100
		for (int i = 0; i<acct.length; i++) {
			acct[i]=new Account(i,100);
		}
		
		
		//outer loop
		while(true) {
		//prompt user for ID
		System.out.println("Enter an ID: ");
		acctID = input.nextInt();
		
		//if ID is incorrect, prompt user for valid ID
		while(acctID < 0 || acctID>9) {
			System.out.println("Incorrect Input\nEnter an ID: ");
			acctID = input.nextInt();
		}
		bLoop = true;
		
		



	//If ID is correct, display menu
	while(bLoop == true) {	
		double amount =0;
		System.out.println("Main Menu");
		System.out.println("1 : Check Balance");
		System.out.println("2 : Withdraw");
		System.out.println("3 : Deposit");
		System.out.println("4 : Exit");
		System.out.println("Enter a choice: ");
		selection = input.nextInt();
		
		
	//prompt user to input selection

	switch (selection)
	{
		
		//Check Balance
		case 1 : 
			System.out.println("The balance is: "+ acct[acctID].getBalance());
			break;

		//Withdraw
		case 2:
			System.out.println("Enter an amount to withdraw: ");
			amount = input.nextDouble();
			acct[acctID].withdraw(amount);
			break;
		//Deposit
		case 3:
			System.out.println("Enter an amount to deposit: ");
			amount = input.nextDouble();
			acct[acctID].deposit(amount);
			break;

		//break loop
		case 4:
			bLoop = false;
			break;
	 
	}//end switch

	}//end inner while loop
	
	}//end outer Loop

	}//end main

	
	//Account Class
	public static class Account {
		
	
	//variables
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();


	//default constructor
	Account () {
	this.id=0;
	this.balance = 0;
	this.annualInterestRate = 0;
	}
	
	//constructor
	Account (int id, double bal){
	this.id = id;
	this.balance = bal;
	}
	
	//getId method
	public int getId() {
		return this.id;
	}

	//setID method
	public void setId(int id) {
		this.id = id;
	}

	//getBalance Method
	public double getBalance(){
		return this.balance;
	}

	//setBalance Method
	public void setBalance(double bal) {
		this.balance = bal;
	}

	//getAnnualInterestRate Method
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	//setAnnualInterestRate Method
	public void setAnnualInterestRate(double rate){
		this.annualInterestRate = rate;
	}
	
	//getDateCreated Method
	public Date getDateCreated() {
		return this.dateCreated;
	}

	//getMonthlyInterestRate Method
	public double getMonthlyInterestRate(){
		return this.annualInterestRate/12;
		
	}

	//getMonthlyInterest Method
	public double getMonthlyInterest(){
		return this.balance*this.getMonthlyInterestRate();
	}

	//withdraw Method
	public void withdraw(double amount){
		if((balance - amount)<0)
		{
			System.out.println("Insufficient Funds");
		}
		else
			balance = balance - amount;
	}

	//deposit Method
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	}//end class






	
	
	


}
