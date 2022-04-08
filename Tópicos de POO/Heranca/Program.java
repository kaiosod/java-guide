package Heranca;

public class Program {

	public static void main(String[] args) {
		
		BusinessAccount account2 = new BusinessAccount(20092,"Kaio");
		SavingsAccount account3 = new SavingsAccount(30099,"Kaio");
		
		
		//Business Account
		
		account2.Deposit(3000.0);
		account2.WithDraw(20.0);
		
		//Savings Account
		
		account3.Deposit(1000.0);
		account3.updateBalance(100.0);
		account3.WithDraw(50.0);
		
		System.out.println("Business Account: "+account2);
		System.out.println("Savings Account: "+account3);

	}

}
