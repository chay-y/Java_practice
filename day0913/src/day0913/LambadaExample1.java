package day0913;

public class LambadaExample1 {
	
	public static void main (String[] args) {
		Person person = new Person();
		
		person.action((name,job)->{
			System.out.println(name+"이 출근을 합니다.");
			System.out.println(job+"을 합니다.");
		});
		
		//퇴근을 합니다.
		person.action((name,job)-> System.out.println(name+"이" +job+"을 하고 퇴근을 합니다."));
	}
}
