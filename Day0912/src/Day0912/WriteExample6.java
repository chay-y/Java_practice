package Day0912;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample6 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("src/files/test6.txt");
		
		char[] array= {'a','b','c','d','e'};
		
		writer.write(array,1,3);

		writer.flush();
		writer.close();
	}
}
