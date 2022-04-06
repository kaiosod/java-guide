package declaracao_imposto;

public class Pj extends Imposto {
	private Integer n_func;
	
	public Pj() {
		
	}
	
	public Pj(String nome, Double renda, Integer n_func) {
		super(nome, renda);
		this.n_func = n_func;
	}
	
	@Override
	public Double calcula() {
		if(n_func > 10) {
			return (renda * 0.14);
		}
		else {
			return (renda * 0.16);
		}
	}
}
