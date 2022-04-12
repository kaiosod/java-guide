package excecoes_2;

import java.util.Scanner;

public class Program  {

	public static void main(String[] args) {
		
		Account client = new Account(39864,"Olavio",1000.0);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor a ser sacado");
		Double x = sc.nextDouble();
		
		
		
		try {
			client.withDraw(x);
		}
		
		catch (AccountException Ae) {
			System.out.println(Ae.getMessage());
		}
		
		System.out.println(client);
		
	}

}
