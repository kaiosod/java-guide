package atividades;

public class Atv1 {
	public static void main (String[] args){
	        
    	Cliente c = new Cliente();
    	
    	c.nome = "Fulano";
    	c.cpf = "67342398734";
    	c.end = "Rua 000";
    	
    	//c.viewAll();
    	System.out.println("Nome: "+ c.getNome());
    	System.out.println("Nome: "+ c.getCpf());
    	System.out.println("Nome: "+ c.getEnd());
    	
    	c.setNome("Kaio");
    	c.setCpf("921833020");
    	c.setEnd("Rua Silveira");
    	
    	System.out.println("Nome: "+ c.getNome());
    	System.out.println("Nome: "+ c.getCpf());
    	System.out.println("Nome: "+ c.getEnd());
    	
    	
    	
    	
	}
}




