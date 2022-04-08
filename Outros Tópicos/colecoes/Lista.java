package colecoes;
import java.util.List;
import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		// adicionar elemento
		
		lista.add("Cesar");
		lista.add("Marlon");
		lista.add("Uilton");
		lista.add("Ana");
		
		System.out.println("-------------------------");
		
		// tamanho da lista
		System.out.println(lista.size());
		
		for (String x: lista) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		
		// remove
		lista.remove("Ana");
		//lista.removeIf(x -> x.charAt(0) == "U");
		
		System.out.println("-------------------------");
		
		// index
		System.out.println(lista.indexOf("Marlon"));
		System.out.println(lista.indexOf("Ana"));
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
