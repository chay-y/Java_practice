package day0919;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StaffManager {
	Scanner scan = new Scanner(System.in);
	List<Staff> staffs = new ArrayList();
	Set<Staff> StaffSet = new TreeSet();
	
	//직원추가
	public void addStaff(Staff staff) {
		staffs.add(staff);
		
		
	}
	
	//이름으로 직원 검색
	public void searchStaff() {
		Scanner scan = new Scanner(System.in);
		System.out.println("직원 이름을 입력하세요 >");
		String name = scan.nextLine();
		
		for(Staff staff : staffs) {
			if(staff.getName().equals(name)) {
				System.out.println(staff);
				break;
			}
		}
	}
	//모든 직원 보기(입력순)
	public void allStaff() {
		System.out.println("이름\t나이\t급여");
		System.out.println("==========================");

		for(Staff staff : staffs) {
			System.out.println(staff.getName()+"\t"+staff.getAge()+"\t"+staff.getPay());
		}
	}
	//급여순으로 직원 보기
	public void payofallStaff() {
		if(staffs.size() == 0) {
			System.out.println("등록된 직원이 없습니다.");
			return;
		}
		for(Staff staff : staffs) {
			System.out.println(staff);
		}
	}
	
}
