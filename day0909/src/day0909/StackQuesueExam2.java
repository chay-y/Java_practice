package day0909;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackQuesueExam2 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void save(String input) {
		if(!input.equals("") && input !=null) {
			
			q.offer(input);
			
			if(q.size() > MAX_SIZE) {
				
				q.remove();
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		boolean flag = true;
		
		while(flag) {
			
			System.out.print("명령어 > ");
			String input = sc.nextLine().trim();
			//trim():공백제거
			
			if(input.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료");
				System.exit(0);
				
			}else if(input.equalsIgnoreCase("help")) {
				
				save(input);
				System.out.println("help - 도움말을 보여줍니다...");
				System.out.println("Q 또는 q - 프로그램을 종료합니다...");
				System.out.println("history - 최근에 입력한 명령어를"+MAX_SIZE+"개 보여줍니다...");
				
			}else if(input.equalsIgnoreCase("history")) {
				
					save(input);
					LinkedList list = (LinkedList) q;
					
				for(int i=0; i<MAX_SIZE; i++) {
					System.out.println((i+1)+". "+list.get(i));
				}	
				
			}else{
				
				save(input);
				
			}
			
			
//			q.offer(input);
			
//			switch(input) {
//			case "help":
//				System.out.println("help - 도움말을 보여줍니다...");
//				System.out.println("Q - 프로그램을 종료합니다...");
//				System.out.println("history - 최근에 입력한 명령어를 5개 보여줍니다...");
//				break;
//			case "history":
//				for(int i=0;i<MAX_SIZE;i++) {
//					System.out.println((i+1)+". "+st.poll());
//					st.offer(st.poll());
//				}
//				break;
//			case "Q":
//				System.out.println("프로그램 종료...");
//				flag = false;
//			}
		}
		
	}
}
