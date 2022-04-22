package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		String path = "/home/kaio/eclipse-workspace/curso_java/src/arquivos/wrt";
		
		String[] lines = new String[] {"121323","4323246","3455647"};
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}

}
}
