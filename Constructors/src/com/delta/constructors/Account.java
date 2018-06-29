package com.delta.constructors;

public class Account {
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	private String accountType;
	private String accountNumber;
	private double accountBalance;

	public Account() {
		System.out.println("Empty constructor called");
	}

	public Account(String customerName, String customerEmailAddress,String customerPhoneNumber, String accountType, String accountNumber, double accountBalance) {
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
		this.accountType = accountType; 
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance; 
	}

	public void deposit(double depositAmount) {
		this.accountBalance = depositAmount + accountBalance;
		System.out.println("Deposit amount " + depositAmount + " The current Balance is " + this.accountBalance);
	}

	public void withdrawal(double withdrawalAmount) {
		this.accountBalance = this.accountBalance - withdrawalAmount;
		if (this.accountBalance <= 0) {
			System.out.println("your account balance is too low");
		} else {
			System.out.println("Your account balance is " + this.accountBalance);
		}
	}

	/**
	 * @return the customerEmailAddress
	 */
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	/**
	 * @param customerEmailAddress
	 *            the customerEmailAddress to set
	 */
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	/**
	 * @return the customerPhonenUmber
	 */
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	/**
	 * @param customerPhonenUmber
	 *            the customerPhonenUmber to set
	 */
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType
	 *            the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance
	 *            the accountBalance to set
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void AccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
