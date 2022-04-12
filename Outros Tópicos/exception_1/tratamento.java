package excecoes_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tratamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int x = sc.nextInt();
			System.out.println(vect[x]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("INDICE INVÁLIDO");
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("ERRO DE ENTRADA");
		}
		finally {
			System.out.println("Finally Executado");
		}
		
		System.out.println("Finalizado");
		
		sc.close();
	}

}
