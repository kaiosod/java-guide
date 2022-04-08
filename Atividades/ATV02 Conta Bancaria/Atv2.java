package atividades;

public class Atv2 {
	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		c1.saldo = 50;
		c2.saldo = 20;
		
		c1.num = "10091";
		c2.num = "10092";
		
		c1.debitar(35);
		c2.creditar(35);
		
		System.out.printf("O número da conta 1 é %s e o saldo é igual a R$%.2f %n", c1.getNum(), c1.getSaldo());
		System.out.printf("O número da conta 2 é %s e o saldo é igual a R$%.2f %n", c2.getNum(), c2.getSaldo());
				
	}

}
