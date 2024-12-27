package day0830;

class Member{
	public String id;
	
	public Member (String id) {
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Member))return false;
		
		Member m = (Member)obj;	
		return this.id == m.id;
	}
}

public class Equals2 {

	public static void main(String[] args) {
		
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println(obj1 == obj2);
		System.out.println("equals: "+obj1.equals(obj2));
		
		System.out.println(obj1 == obj3);
		System.out.println(obj1.equals(obj3));
		
	}
}
