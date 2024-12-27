package d1;

//import java.util.ArrayList;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		int num;
		boolean game = true;
		
		Scanner n = new Scanner(System.in);
	
		while(true) {
			
			int clapping = 0;
			
			System.out.println("==========================");
			System.out.println("박수 게임을 시작합니다...");
			System.out.println("1부터 999까지의 숫자를 입력하세요(-1을 입력하면 게임을 종료합니다.)");
			num = n.nextInt();
			System.out.println("==========================");
			
			if(num == -1) {
				System.out.println("게임을 종료합니다");
				break;
			} else if(num<0 || num>1000) {
				System.out.println("1부터 999까지의 숫자만 입력 가능합니다.");
				continue;
			}
			
			String clap =String.valueOf(num);
			String[] c = clap.split("");
			
			for(int i = 0; i<c.length;i++) {
				if(c[i].equals("3") ||c[i].equals("6")||c[i].equals("9")) {
					clapping++;
				}
			}
			System.out.println("박수 "+clapping+"번");
		}

	}
}
