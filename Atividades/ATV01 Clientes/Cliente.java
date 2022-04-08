package atividades;

public class Cliente {
	public String nome;
	public String cpf;
	public String end;
	
	public void viewAll() {
		System.out.printf("O cliente %s com cpf: %s e endereço: %s foi criado %n", this.nome, this.cpf, this.end);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getEnd() {
		return this.end;
	}
	
	public void setNome(String x) {
		this.nome = x;
	}
	
	public void setCpf(String x) {
		this.cpf = x;
	}
	
	public void setEnd(String x) {
		this.end = x;
	}
}
