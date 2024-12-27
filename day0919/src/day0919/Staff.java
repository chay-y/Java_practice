package day0919;

public class Staff {

	private String name;
	private int age;
	private int pay;
	
	public Staff(String name,int age,int pay) {
		this.name=name;
		this.age=age;
		this.pay=pay;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int compareTo(Staff o) {
		return this.pay - o.pay;
	}
}
