package day0828;

import java.util.Scanner;

public class CharacterMain1 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		Pika pika = new Pika(30,1,50);
		pika.Info();
		
		System.out.println("할 행동을 골라주세요 ->");
		pika.nowInfo(pika.act = s.next());
		
	}
}


