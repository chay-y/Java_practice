package Day0912;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class BankAccount{
	String name;
	String num;
	int money;
	
	public void BankAccount(String name,String num,int money) {
		this.name=name;
		this.num=num;S
		this.money=money;
	}
}

public class BankAccountMain {

	public static void main(String[] args) throws IOException{
		
		
		BankAccount a = new BankAccount("김그린","123-456",100000);
		BankAccount b = new BankAccount("이자바","456-875",400000);
		
		//파일 객체 생성
		File file = new File("accounts-data.txt");
		
		//File객체와 연결
		//파일을 생성하기 위해 대상 파일을 입력값으로 전달
		FileWriter fw = new FileWriter(file);
		
		//파일에 내용을 작성함
		fw.write(a.toString()+"\n");
		fw.write(b.toString()+"\n");
		
		fw.close();
	}
}
