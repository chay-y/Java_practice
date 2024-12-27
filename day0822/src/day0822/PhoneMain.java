package day0822;

public class PhoneMain {

	public static void main(String[] args) {
		Galaxy g = new Galaxy();
		g.name="z플립";
		g.spec="접혀요";
		g.cost=1200000;
		
		g.phoneInfo();
		
		Apple a = new Apple("미니", "작아요", 1300000);
		
		a.phoneInfo();
		
	}
}
