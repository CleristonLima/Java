package entities;

public class Dados_bancarios {
	
	public static final double tax = 5.0;
	
	private int number;
	private String holder;
	private double balance;
	
	public Dados_bancarios(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Dados_bancarios(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
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
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + tax;
	}
	
	public String toString() {
		
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
