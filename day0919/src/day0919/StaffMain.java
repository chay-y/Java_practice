package day0919;

import java.util.Scanner;

public class StaffMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StaffManager sm = new StaffManager();
		
		while(true) {
			System.out.println("------------직원 관리 프로그램------------");
			System.out.println("1. 직원 추가 2. 직원 검색 3. 모든 직원 보기 4. 급여순으로 직원 보기 5. 종료");
			System.out.println("-------------------------------------");
			
			System.out.println("메뉴 선택 > ");
			int choice = scan.nextInt();

				switch(choice){
				case 1 :
					Scanner scan1 = new Scanner(System.in);
					System.out.println("이름 > ");
					String name = scan1.nextLine();
					
					System.out.println("나이 > ");
					int age = Integer.parseInt(scan1.nextLine());
					
					System.out.println("급여 > ");
					int pay = Integer.parseInt(scan1.nextLine());
					
					Staff staff = new Staff(name,age,pay);
					sm.addStaff(staff);
					
					break;
					
				case 2 :
					sm.searchStaff();
					break;
				case 3 :
					sm.allStaff();
					break;
				case 4 :
					sm.payofallStaff();
					break;
				case 5 :
					System.exit(0);
				}
		}
	}
}
