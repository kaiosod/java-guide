package excecoes_2;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	//private Double limit = balance * 10;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void deposit(Double balance) {
		this.balance += balance;
	}
	
	public void withDraw(Double balance) throws AccountException{
		if (balance == 0) {
			throw new AccountException("Sem Saldo");
		}
		else if(balance > this.balance) {
			throw new AccountException("Saldo insuficiente");
		}
		else {
			this.balance -= balance;
		}	
	}
	
	public String toString() {
		return "Number: "+ number +" Holder: " + holder + " Balance: " + balance;
	}

}
