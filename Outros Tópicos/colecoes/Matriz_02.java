package colecoes;
import java.util.Scanner;

public class Matriz_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas e colunas");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite um valor a ser encontrado na matriz");
		int x = sc.nextInt();
		
		sc.close();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				 if (matriz[i][j] == x) {
					 System.out.println(i + j);
					 
					 if (i>0) {
						 System.out.println("Acima "+ matriz[i-1][j]);
					 }
					 if (j>0) {
						 System.out.println("Esquerda "+ matriz[i][j-1]);
					 }
					 if (i < matriz.length -1) {
						 System.out.println("Abaixo "+ matriz[i+1][j]);
					 }
					 if (j< matriz.length - 1) {
						 System.out.println("Direita "+ matriz[i][j+1]);
					 }
				 }
			}
		}
		
		
		
		
	}

}
