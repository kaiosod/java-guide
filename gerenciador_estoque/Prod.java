package gerenciador_estoque;


public class Prod {
	
	private Integer id;
	private String nome;
	private Integer quant;
	private Double preco;
	
	public Prod() {
		
	}
	
	public Prod(Integer id, String nome, Integer quant, Double preco) {
			this.id = id;
			this.nome = nome;
			this.quant = quant;
			this.preco = preco;
			
		}
	
	public void alter(String nome, Integer quant, Double preco) {
		this.nome = nome;
		this.quant = quant;
		this.preco = preco;
	}
	
	public String toString() {
		return "ID: "+id+" Nome: "+nome+" Quantidade: "+quant+" Preco: R$ "+preco;
	}
	
}
