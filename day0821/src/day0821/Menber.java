package day0821;

public class Menber {
	String name;
	String tel;
	String adress;
	
	public Menber() {
		name = "no name";
		tel = "no tell";
		adress = "no adress";
	}
	
	public Menber(String name,String tel, String adress) {
		this.name = name;
		this.tel = tel;
		this.adress = adress;
	}

	void print() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("adress : "+adress);
	}
}
