package com.delta.constructors;

public class Main {

	public static void main(String[] args) {
			
	   	Account account1 = new Account("Vijay Bhasker Chowdarpally", "vijaybhaskerch@gmail.com", "(302)-465-1188", "SavingsAccount", "A2019213D2", 12000.00);
		
	   	System.out.println("The details of the current account is " + "\nCustomerName: " + account1.getCustomerName() + "\nCustomerEmail: " + account1.getCustomerEmailAddress() + "\nCustomerPhoneNumber: " + account1.getCustomerPhoneNumber() + "\nCustomerType: " + account1.getAccountType() + "\nAccountNumber: " + account1.getAccountNumber() + "\nAccountBalance: " + account1.getAccountBalance()); 
	   	
	   	account1.deposit(1000.25);
			account1.withdrawal(200.25);
		
	}
	
}
 