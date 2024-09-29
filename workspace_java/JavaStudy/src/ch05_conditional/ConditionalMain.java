package ch05_conditional;

/**
 * class Name   : ConditionalMain
 * Author       : Jay
 * Created Date : 2024. 8. 6.
 * Version      : 1.0
 * Purpose      : 조건문
 * Description  : if & switch
 */
public class ConditionalMain {

	public static void main(String[] args) {
		int score = 85;
		String grade = "";
		if (score > 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else {
			grade = "c";
		}
		System.out.println(score + "는" + grade);
		
		int price = 3000;
		int myMoney = 1000;
		if (price > myMoney) {
			System.out.println("돈이 부족합니다");
		}else {
			System.out.println("구매 가능합니다");
		}
		
		// 조건 1: 이름은 1글자 이상
		// 조건 2: 전화번호는 10 or 11자리
		// 조건 1이 만족하지 않으면 가입 실패
		String nm = "팽수";
		String phone = "01012345678";
		if(nm.length() >= 1) {
			if (phone.length() ==10 || phone.length() == 11) {
				System.out.println("환영합니다");
			}else {
				System.out.println("가입 실패");
			}
		}else {
			System.out.println("가입 실패");
		}
		
		
	}

}
