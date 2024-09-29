package ch05_conditional;

/**
 * class Name   : ConditionalMain2
 * Author       : Jay
 * Created Date : 2024. 8. 7.
 * Version      : 1.0
 * Purpose      :
 * Description  : 
 */

public class ConditionalMain2 {

	public static void main(String[] args) {
		// switch 문은 단순 값을 매칭하는 경우 사용
		int num = 1;
		switch(num) {
		case 0:
			System.out.println("수강등록");
			break;
		case 1:
			System.out.println("기초 프로그래밍");
			break;
		case 2:
			System.out.println("취업관련");
			break;
		default:
			System.out.println("종료");	
		}

		//문자열 비교
		String a = "팽수";
		if ( a == "팽수") { // java 7 이상에서 문자열도 == 비교 가능
			System.out.println("팽수^^");
		}
		if (a.equals("팽수")) { // 이전 버전에서 문자열 비교
			System.out.println("팽수!!");
		}
		
	}
}
