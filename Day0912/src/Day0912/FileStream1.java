package Day0912;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream1 {

	public static void main(String[] args) throws Exception {
		
		try(FileInputStream in =new FileInputStream("src/files/input.txt");
			FileOutputStream out=new FileOutputStream ("src/files/output.txt")){
	
			int buffer;
	
			while((buffer=in.read())!=-1) {
				System.out.println((char)buffer);
				out.write(buffer);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		in.close();
		out.close();
	}
}
