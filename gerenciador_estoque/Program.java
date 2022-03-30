package gerenciador_estoque;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite a quantidade de produtos a ser adicionada");
		int n= sc.nextInt();
		
		Prod[] p = new Prod[n];
			
	
		do {
			System.out.println("\nDigite 0 para sair");
			System.out.println("Digite 1 para inserir produtos");
			System.out.println("Digite 2 para alterar produto");
			System.out.println("Digite 3 para vizualizar produto");
			System.out.println("Digite 4 para apagar produto \n");
			
			x = sc.nextInt();
			
			switch(x) {
			
				case 0:
					break;
				case 1:
					for(int i=0;i < n; i++) {
						System.out.println("Digite o nome do produto");
						String nome = sc.next();
						System.out.println("Digite a quantidade");
						Integer quant = sc.nextInt();
						System.out.println("Digite o valor");
						Double preco = sc.nextDouble();
						
						p[i] = new Prod(i,nome,quant,preco);
					}
					break;
					
				case 2:
					System.out.println("Digite o ID do produto a ser alterado");
					int id1 = sc.nextInt();
					
					System.out.println("\nDigite o novo nome");
					String nome = sc.next();
					System.out.println("Digite a nova quantidade");
					int quant = sc.nextInt();
					System.out.println("Digite o novo preco\n");
					double preco = sc.nextDouble();
					
					p[id1].alter(nome, quant, preco);
					
					break;
					
				case 3:
					System.out.println("Digite o ID do produto a ser consultado");
					int id2 = sc.nextInt();
					
					System.out.println(p[id2]);
					break;
					
				case 4: 
					System.out.println("Digite o ID do produto a ser apagado");
					int id3 = sc.nextInt();
					
					p[id3].alter(null, null, null);
					break;
					
				default:
					System.out.println("\n ERRO! Digite Novamente! \n");
					
			}
			
		}while(x != 0);
		
		System.out.println("Lista de todos os produtos");
		for(int i=0;i<n;i++) {
			
			System.out.println("------------------------------------------------------------------");
			System.out.println(p[i]);
			System.out.println("------------------------------------------------------------------\n");
		}

	}

}
