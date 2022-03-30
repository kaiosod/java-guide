package atividades;

public class Class2 {
	public String s1;
	public String s2;
	public Integer i1;
	
	public Class2() {
		
	}
	public Class2(String s1, String s2, Integer i1) {
			this.s1 = s1;
			this.s2 = s2;
			this.i1 = i1;
		}
	
	public Class2(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
		
	}
	/*
	ERRO: Pois assim os valores passados satisfazem os metodos construtores ocorrendo uma dualidade
	
	public Class2(String s1) {
		this.s1 = s1;
	}
	
	public Class2(String s2) {
		this.s2 = s2;
	}
	*/
	
	public Class2(String s1, Integer i1) {
		this.s1 = s1;
		this.s2 = s2;
		
	}
	
	public Class2(Integer i1) {
		this.i1 = i1;
	}
}
