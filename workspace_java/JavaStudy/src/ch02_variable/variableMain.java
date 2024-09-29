package ch02_variable;
// alt + shift + j 자동주석

/**
 * class Name   : variableMain
 * Author       : Jay
 * Created Date : 2024. 8. 5.
 * Version      : 1.0
 * Purpose      :
 * Description  : 
 */

public class variableMain {

	public static void main(String[] args) {
		// 상수 Constant 변경 불가
		final double MATH_PI = 3.14;
//		MATH_PI = 1; //<-- 상수는 변경하려면 오류남, 보통 표기 위해 전부 대문자
		
		double mathPi2 = 3.14;
		mathPi2 = 1; //변수는 변경 가능
		System.out.println(mathPi2);

		
		// 문자열 String 타입은 클래스로 관리되어짐 (다양한 메소드(함수)를 내장하고 있음)
		String fruits = "Apple, Banana, Cherry";
					   //01234567
		// .length() 문자열의 길이를 리턴
		System.out.println(fruits);
		System.out.println(fruits.length());
		// .indexOf() 특정 문자열을 찾아서 첫번째 인덱스를 리턴
		// 문자열의 인덱스는 0부터 시작
		System.out.println(fruits.indexOf("Banana"));
		// .substring(시작 인덱스) 시작부터 끝까지
		// , or (시작, 종료 인덱스) 시작부터 종료 인덱스까지
		System.out.println(fruits.substring(15));
		System.out.println(fruits.substring(7,13));
		String stu = "팽수:10";
		String name = stu.substring(0, 2);
		String age = stu.substring(3);
		System.out.println(name);
		System.out.println(age);
		String stu2 = "김길동:200";
		String stu3 = "남궁민수:100";
		
	
	}
}
