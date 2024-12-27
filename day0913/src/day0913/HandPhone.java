package day0913;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HandPhone {
	static String fname = "src/files/juso.txt";
	
	static class address {
		String name;
		String age;
		String phone;
		
		address(String name, String age, String phone) {
			this.name = name;
			this.age = age;
			this.phone = phone;
		}
	}
	
	static void print_menu() {
		System.out.println("----------------");
		System.out.println("1. 연락처 출력");
		System.out.println("2. 연락처 등록");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 종료");
		System.out.println("----------------");
	}
	
	//연락처 출력
	static void view_juso() throws IOException{
		String str = "";
		
		//파일 객체 생성
		File f = new File(fname);
		
		//파일 객체가 없으면 파일을 새로 생성
		if (!f.exists()) {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}
		
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		int i;
		
		//기존 연락처를 모두 읽어옴
		for(i=1;;i++) {
			
			//파일을 읽어올 수 없으면
			if (!br.ready()) {
				break;
			} else {
				//파일에 저장된 내용을 한줄씩 읽어옴
				str = br.readLine();
				System.out.printf("%2d : %s \n", i, str);
			}
			
		}
		
		//실제 파일에 내용이 없음
		if (i==1) {
			System.out.println("등록된 연락처가 없습니다.");
		}
		
		br.close();
	}
	
	//연락처 추가
	static void add_juso() throws IOException {
		Scanner scan = new Scanner(System.in);
		address add = new address("","","");
		
		//파일을 추가모드로 열기
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));
		
		System.out.print("이름 > ");
		add.name = scan.nextLine();
	
		System.out.print("나이 > ");
		add.age = scan.nextLine();
		
		System.out.print("전화번호 > ");
		add.phone = scan.nextLine();
		
		String wstr = add.name + "\t" + add.age + "\t" + add.phone;
		
		//파일에 문자열 쓰기
		bw.write(wstr);
		bw.newLine(); //커서를 다음줄로 내려두기
		bw.close();
	}
	
	static void delete_juso() throws IOException {
		Scanner scan = new Scanner(System.in);
		
		String[] readStr = new String[50];
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		if (!br.ready()) {
			System.out.println("등록된 연락처가 없습니다.");
			return;
		}
		
		System.out.print("삭제할 행 번호 > ");
		int delLine = scan.nextInt();
		
		String str = "";
		int count=0;
		for (int i=0; i<50; i++) {
			
			if ( (str = br.readLine()) == null)
				break;
		
			if (i+1 != delLine) {
				readStr[count] = str;
				count++;
			} else {
				System.out.println(delLine + "번이 삭제되었습니다.");
			}
		}
		
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
		
		for (int i=0; i<count; i++) {
			bw.write(readStr[i]);
			bw.newLine();
		}
		
		bw.close();
		 
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("--- 연락처 관리 프로그램 ---");
		
		String select = "";
		
		while (select != "4") {
			
			print_menu();
			select = scan.next();
			
			switch (select) {
			case "1":
				view_juso();
				break;
			
			case "2":
				add_juso();
				break;
				
			case "3":
				view_juso();
				delete_juso();
				break;
				
			case "4":
				return;
				
			default:
				System.out.println("잘못 입력했어요. 다시 입력해주세요.");
			}
		}
	}
}
