package d1;

import java.util.Arrays;
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
	
		int balls [] = new int[3];
        int userBalls[] = new int[3]; 

        int strike = 0; 
        int ball = 0; 
        int tried = 1;
        
        for (int i=0; i<balls.length; i++) {
        	balls[i] = (int) (Math.random() * 9 + 1); 
            for (int j=0; j<i; j++) {
                if (balls[j] == balls[i]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("만들어진 숫자 : ");
        for (int x : balls) {
            System.out.print(x+" ");
        }
        System.out.println("\n숫자를 정했습니다. 게임을 시작합니다.");
        
        Scanner s = new Scanner(System.in);

        while (true) {

            for (int j=0; j<userBalls.length; j++) {
                System.out.print((j+1)+"번째 숫자 > "); 
                userBalls[j] = s.nextInt(); 
                
                for (int k=0; k<j; k++) {
                    if (userBalls[k] == userBalls[j]) {
                        System.out.println("중복값은 입력이 불가함");
                        j--;
                        break;
                    	}
                	}
            	}
            
            System.out.print(tried+" >> ");
            for(int y : userBalls) {
            	System.out.print(y+" ");
            }
            System.out.println();
            tried += 1;
            
            for (int i=0; i<balls.length; i++) {
                for (int j=0; j<userBalls.length; j++) {
                    if (balls[i] == userBalls[j] && i == j) {
                        strike++;
                    } else if (balls[i] == userBalls[j] && i != j) {
                        ball++;
                    }
                }
            }
            
            System.out.println(strike + "스트라이크 " + ball + "볼");
            
            if (strike == 3) {
                System.out.println("정답!");
                System.out.println((tried-1)+"회만에 정답을 맞췄습니다.");
                break;
            }
            strike = 0;
            ball = 0;
            

        }
	
	}
}
