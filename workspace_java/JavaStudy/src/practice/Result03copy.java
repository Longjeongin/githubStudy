package practice;

import java.util.Scanner;

public class Result03copy {

	public static void main(String[] args) {
		// Q.3 업다운 게임
		// 1 ~ 50 사이의 랜덤 정수 생성
		// 기회는 5번
		int randInt = (int) (Math.random() * 50 + 1);
		// Math.random() <-- 난수 생성 메소드 0 ~ 1 사이 실수 
		int chance = 5;
		Scanner scan = new Scanner(System.in);		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int userInput = Integer.parseInt(scan.nextLine());
			if(userInput == randInt) {
				System.out.println("정답입니다.");
				break;
			}
			chance--;
			if (chance == 0) {
				System.out.println("기회를 모두 소진하였습니다. 정답은" + randInt + " 입니다.");
				break;
			}
			if (userInput > randInt) {
				System.out.print("다운. ");
			}else if (userInput < randInt) {
				System.out.print("업. ");	
			}
			System.out.println("남은 기회는 " + chance + "번입니다.");
		}
		scan.close();
	}

}
