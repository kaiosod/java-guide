package colecoes;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		
		for (int i=0;i<n;i++) {
			vetor[i] = sc.nextDouble();
		}
		
		sc.close();
		System.out.println("Vetor"+vetor[1]);
		
		

	}

}
