package Day0912;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample7 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("src/files/test7.txt");
		
		String str = "ABC";
		writer.write(str);
		writer.flush();
		writer.close();
	}
}
