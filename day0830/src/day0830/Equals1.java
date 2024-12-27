package day0830;

class Value{
	
	int value;

	Value(int value) {
		this.value=value;
	}
	
	//값을 비교하기 위하여 equals를 오버라이딩 해야함
	public boolean equals(Object obj) {
		
		if(obj instanceof Value){
			Value v = (Value) obj;
			return this.value == v.value;
		}else {
			
		}
		return false;
		
	}
}

public class Equals1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1.equals(v2));
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2가 같습니다.");
		}else {
			System.out.println("v1과 v2가 다릅니다.");
		}
		
		v1=v2;
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2가 같습니다.");
		}else {
			System.out.println("v1과 v2가 다릅니다.");
		}
	}

	
}
