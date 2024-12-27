package day0829;

import java.io.file;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("input.txt"));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
