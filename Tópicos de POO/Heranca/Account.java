package Heranca;

public abstract class Account {
	protected Integer number;
	protected String holder;
	protected Double balance = 0.0;
	
	public Account() {
		
	}
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
		}
	
	public Double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Number: " + number + " Holder: " + holder + " Balance: " + balance ;
	}
	
	public void Deposit(Double value) {
		this.balance += value;
	}
	
	public void WithDraw(Double value) {
		this.balance = this.balance - value - 6.0;
	}
	
}
