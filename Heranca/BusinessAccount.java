package Heranca;

public class BusinessAccount extends Account {
	private Double loanLimit = balance * 15;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder){
		super(number,holder);
		this.loanLimit = loanLimit;
	}
	
	public void Loan(Double value) {
		if (value <= this.loanLimit) {
			Deposit(value);
		}
	}
	
	@Override
	public void WithDraw(Double value) {
		super.WithDraw(value);
		this.balance -= 10.0;
		
	}
}
