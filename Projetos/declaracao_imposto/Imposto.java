package declaracao_imposto;

public abstract class Imposto {
	protected String nome;
	protected Double renda;
	
	public Imposto() {
		
	}
	
	public Imposto(String nome, Double renda) {
		this.nome = nome;
		this.renda = renda;
	}
	
	public Double calcula() {
		return 0.0;
	}
	
	public String toString() {
		return " Nome: " + nome + " Renda: " + renda;
	}
}
