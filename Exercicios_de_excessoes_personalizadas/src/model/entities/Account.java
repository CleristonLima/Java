package model.entities;
import model.exceptions.BussinessException;


public class Account {

	private int number;
	private String holder;
	private double balance;
	private double withDrawLimit;
	
	public Account() {
		
	}
	
	public Account(int number, String holder, double balance, double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withDrawLimit(double amount) {
		updateAccount(amount);
		balance -= amount;
	}
	
	public void updateAccount(double amount) {
		
		if(amount > getWithDrawLimit()) {
			throw new BussinessException("The amount exceeds withdraw limit");
		}
		
		if (amount > getBalance()) {
			
			throw new BussinessException("Not enough balance");
		}
	}
	
	
}
