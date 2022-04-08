package declaracao_imposto;

public class Pf extends Imposto {
	private Double gasto_saude;
	
	public Pf() {
		
	}
	
	public Pf(String nome, Double renda, Double gasto_saude) {
		super(nome,renda);
		this.gasto_saude = gasto_saude;
	}
	
	@Override
	public Double calcula() {
		if(renda < 20000.0) {
		
			return  (renda * 0.15) - (gasto_saude * 0.5);
		}
		else {
			return  (renda * 0.25) - (gasto_saude * 0.5);
		}
		
	}

}
