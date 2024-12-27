package day0828;

class Employee{
	String name;
	int age;
	String adress;
	String department;
	int salary;
	
	Employee(String name, int age, String adress, String department) {
		this.name=name;
		this.age=age;
		this.adress=adress;
		this.department=department;
	}
	
	void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+adress);
		System.out.println("부서 : "+department);
	}
}

class Regular extends Employee{
	Regular (String name, int age, String adress, String department){
		super (name, age, adress, department);
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("정규직");
		System.out.println("월급 : "+salary);
	}
	
}

class Temporary extends Employee{
	int workhour;
	int timePay = 10000;
	
	Temporary (String name, int age, String adress, String department){
		super (name, age, adress, department);
	}
	
	public void setWorkhour(int workhour) {
		this.workhour=workhour;
		this.salary=workhour*timePay;
	}
	

	public void printInfo() {
		super.printInfo();
		System.out.println("비정규직");
		System.out.println("일한시간 : "+workhour);
		System.out.println("급여 : "+salary);
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		Regular r = new Regular("김그린",35,"울산","개발부");
		r.setSalary(5000000);
		r.printInfo();
		
		Regular t = new Regular("이자바",22,"서울","총무부");
//		t.setWorkhour(120);
		t.printInfo();
		
		
		
	}
}
