package atividades;

public class ContaBancaria {
	double saldo;
	String num;
	
	public double creditar(double x) {
		return this.saldo = this.saldo + x;
	}
	
	public double debitar(double x) {
		return this.saldo = this.saldo - x;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public String getNum() {
		return this.num;
	}
}
