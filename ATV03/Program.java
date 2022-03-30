package atividades;

public class Program {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		
		System.out.println(c1); // Q1 RESPOSTA = s1=null, s2=null, i1=null, b1=false 
		System.out.println("----------------------------");
		
		Class2 c2 = new Class2(); // Q2 RESPOSTA = 5 classes
	
		System.out.println("----------------------------");
		
		byte b = 20;
		short s = 200;
		int i = 2000;
		long l=20000;
		
		float f = 40; // PERGUNTAR 
		
		f = b;
		System.out.println(f);
		f = s;
		System.out.println(f);
		f = i;
		System.out.println(f);
		f = l;
		System.out.println(f);
		
		System.out.println("----------------------------");
		
		b = (byte)f;
		System.out.println(b);
		b = (byte) s;
		System.out.println(b);
		b = (byte) i;
		System.out.println(b);
		b= (byte) f;
		System.out.println(b);
		
		System.out.println("----------------------------");
		
		s = b;
		System.out.println(s);
		s = (short) i;
		System.out.println(s);
		s = (short) l;
		System.out.println(s);
		s = (short) f;
		System.out.println(s);
		
		System.out.println("----------------------------");
		
		i = b;
		System.out.println(i);
		i = s;
		System.out.println(i);
		i = (int) l;
		System.out.println(i);
		i = (int) f;
		System.out.println(i);
		
		System.out.println("----------------------------");
		
		l = b;
		System.out.println(l);
		l = s;
		System.out.println(l);
		l = i;
		System.out.println(l);
		l = (long) f;
		System.out.println(l);
		
		// RESPOSTA: É impossivel refereciar tipos de dados que suportam valores maiores do que o tipo alvo
		
		

	}

}
