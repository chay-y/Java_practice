package day0823;

class Member{
	private String name;
	private String tel;
	private String address;
	
	public void printMember(){
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
	
	//getter, setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel=tel;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
}

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		
		m.setName("김그린");
		m.setTel("010-000-0000");
		m.setAddress("울산시");
		
		System.out.println(m.getName());
		System.out.println(m.getTel());
		System.out.println(m.getAddress());
		
//		m.printMember();
	}
}
