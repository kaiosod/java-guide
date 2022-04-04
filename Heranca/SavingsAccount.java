package Heranca;

public class SavingsAccount extends Account{
	private Double interestRate = 0.11;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(Integer number, String holder) {
		super(number,holder);
	}
	
	public void updateBalance(Double value) {
		balance += (balance*interestRate);
	}
	
	
	public void WithDraw(Double value) {
		this.balance -= value;
	}
	
	
	public String toString() {
		return "Number: "+number+" Holder: "+holder+" Balance: "+balance;
	}
}
