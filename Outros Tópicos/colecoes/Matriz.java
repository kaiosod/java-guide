package colecoes;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a ordem da matriz");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		int[] vetor = new int[3];
		for (int i=0; i<n; i++) {
			vetor[i] = matriz[i][i];
			System.out.println("Diagonal principal"+vetor[i]);
		}
		int count = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if(matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Valores negativos = "+count);
		
		
	}
	
	

}
