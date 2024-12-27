package Day0912;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample5 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("src/files/test5.txt");
		
		char[] array = {'a','b','c'};
		
		writer.flush();
		writer.close();
	}
}
