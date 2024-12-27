package day0904;

import java.util.ArrayList;
import java.util.Scanner;

class Member{
//	이름,전화번호,주소를 저장하는 주소록 생성
	private String name;
	private String tel;
	private String adress;
	
	public Member(String name, String tel, String adress) {
		this.name=name;
		this.tel=tel;
		this.adress=adress;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	@Override
	public String toString() {
		return String.format("Member [ name : %s, tel : %s, address : %s]",name,tel,adress);
	}
	
}

class MemberMenu{
//	추가, 검색, 수정, 삭제, 전체출력, 데이터초기화, 종료
//	추가 : 이름, 전화번호, 주소를 저장
//	검색  : 이름을 입력받아서 이름, 전화번호, 주소를 출력
//	수정 : 이름을 입력받아서 새로운 전화번호와 새로운 주소 입력받기
//	삭제 : 이름을 입력받아 해당 데이터 삭제
//	전체출력 : 주소록 전체의 내용을 출력
//	데이터 초기화 : 주소록의 모든 내용 삭제
//	종료 : 종료됨
	Scanner sc = new Scanner(System.in);
	
	private String menuStr = "1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.데이터초기화 7.종료";
	int menu;
	
	public void menuProcess(ArrayList<Member> data) {
		
		int idx = 0;
		boolean flag = true;
		
		while (true) {
			System.out.println(menuStr);
			menu = sc.nextInt();
			sc.nextLine(); //nextInt()를 이용하여 줄바꿈과 관련된 문자가 버퍼에 남아있게되어 엔터를 친 것과 같은 효과가 나옴
			// 버퍼에 남아있는 줄바꿈 문자를 제거하기위해 nextLine()을 뒤에 사용
			
			switch(menu) {
			case 1 :
				data.add(infoInput());
				break;
			case 2 :
				idx = search(data);
				if(idx >=0) {
					System.out.println(data.get(idx));
				}
				break;
			case 3 :
				editMember(data);
				break;
			case 4 :
				delMember(data);
				break;
			case 5 :
				for (int i = 0; i<data.size(); i++) {
					System.out.println(data.get(i));
				}
				break;
			case 6 :
				
				break;
			case 7 :
				
				break;
			}
		}
	}
	
	public Member infoInput() {
		System.out.println("이름 > ");
		String name = sc.nextLine();
		
		System.out.println("전화번호 > ");
		String tel = sc.nextLine();

		System.out.println("주소 > ");
		String adress = sc.nextLine();
		
		return new Member(name, tel, adress);
	}
	
	public void search(ArrayList<Member> data) {
		System.out.println("이름 > ");
		String name = sc.nextLine();
		
		for (int i=0; i<data.size(); i++) {
			if(name.equals(data.get(i).getName())) {
				return i;
			}
		}
		System.out.println("일치하는 사람이 없습ㄴ디ㅏ.");
		return -1;
	}
	
	public void editMember(ArrayList<Member>data) {
		int idx =search(data);
		
		if(idx != -1) {
			System.out.println("새 전화번호 > ");
			String tel = sc.nextLine();
			
			System.out.println("새 주소 > ");
			String adress = sc.nextLine();
			
			data.set(idx, new.Member(data.get(idx).getName(),tel));
		}
	}
	
	public void delMember() {
		
	}
	
	
}

public class ArrayListExam3 {

	public static void main(String[] args) {
		ArrayList<Member>data = new ArrayList<Member>();
		MemberMenu mm = new MemberMenu();
		mm.menuProcess(data);
	}
}
