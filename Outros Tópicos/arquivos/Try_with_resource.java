package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_with_resource {

	public static void main(String[] args) {
		
		String path = "/home/kaio/eclipse-workspace/curso_java/src/arquivos/arq.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
