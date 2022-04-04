package Polimorfismo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		List<Employee> lista = new ArrayList();
		
		System.out.println("Digite a quantidade de funcionarios");
		Integer n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
			System.out.println("Tercerizado ? (s/n)");
			char tipo = sc.next().charAt(0);
			
			System.out.println("Digite o nome");
			String name = sc.next();
			
			System.out.println("Digite a quantidade de horas trabalhadas");
			Integer hour = sc.nextInt();
			
			System.out.println("Digite o valor a ser pago por hora ");
			Double valuePerHour = sc.nextDouble();
			
			if(tipo == 's') {
				System.out.println("Digite o valor adicional");
				Double additional = sc.nextDouble();
				
				Employee empl = new OutsourcedEmployee(name,hour,valuePerHour,additional);
				lista.add(empl);
			}
			
			else {
				Employee empl = new Employee(name,hour,valuePerHour);
				lista.add(empl);
			}
		}
		
		for(Employee empl : lista) {
			System.out.println(empl.toString());
		}
		
		sc.close();
		
	}
}
