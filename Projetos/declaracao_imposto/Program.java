package declaracao_imposto;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int op=1;
		
		List<Imposto> lista = new ArrayList();
		
		
		do {
			System.out.println("\n\nDIGITE 1 PARA REGISTRO DE IMPOSTO");
			System.out.println("DIGITE 2 PARA REMOVER REGISTRO DE IMPOSTO");
			System.out.println("DIGITE 3 PARA VIZUALIZAR UM REGISTRO DE IMPOSTO");
			System.out.println("DIGITE 4 PARA VIZUALIZAR TODOS REGISTROS DE IMPOSTOS");
			System.out.println("\n***DIGITE 0 PARA SAIR***\n\n");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("Digite o nome");
					String nome = sc.next();
					System.out.println("Digite a renda");
					Double renda = sc.nextDouble();
					System.out.println("Pessoa Física ? Digite (s/n)");
					char op2 = sc.next().charAt(0);
					
					if(op2 == 's') {
						System.out.println("PESSOA FÍSICA");
						System.out.println("Digite o gasto com saúde, Caso nao tenha gastos digite 0 ");
						Double gasto_saude = sc.nextDouble();
						Imposto imp = new Pf(nome,renda,gasto_saude); 
						lista.add(imp);
					}
					else {
						System.out.println("PESSOA JURÍDICA");
						System.out.println("Digite a quantidade Funcionarios ");
						Integer n_func = sc.nextInt();
						Imposto imp = new Pj(nome,renda,n_func);
						lista.add(imp);
					
					}
					break;
					
				case 2:
					
					System.out.println("\n\nREMOÇÃO DE REGISTRO \n\n     -LISTA DE REGISTROS- \n\n");
					for(Imposto x : lista) {
						System.out.println("ID: " +lista.indexOf(x) + "->" + x);
					}
					
					System.out.println("\nDIGITE O ID DO REGISTRO Á SER REMOVIDO\n");
					int op3 = sc.nextInt();
					
					lista.remove(op3);
					
					break;
													
				case 3:
					
					System.out.println("\n\nVIZUALIZAÇÃO DE REGISTRO \n\n");
					
					System.out.println("\nDigite o ID do registro a ser vizualizado\n");
					int op4 = sc.nextInt();
					System.out.println(lista.get(op4));
					
					break;
					
					
				case 4:
					System.out.println("\n\n-LISTA DE REGISTROS- \n\n");
					for(Imposto x : lista) {
						System.out.println("ID: " +lista.indexOf(x) + "->" + x + " Valor de Imposto a ser pago -> R$ "+ x.calcula());
					}
					break;
					
			}
		}while(op != 0);
		
		sc.close();
	}

}
