package poo_wallet;

public class Program {
	public static void main (String[] args) {
				
		CryptoCoins x1 = new CryptoCoins("BTC",32030.0,182552.52); 
		Assets x2 = new Shares("VALE3",109.75,30); //Exemplo de Polimorfismo
		
		System.out.println(x1);
		System.out.println(x2);
	}
}
