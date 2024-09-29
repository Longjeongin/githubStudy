package ch04_operator;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		// 사용자에게 이메일 주소를 입력받으세요
		// email형식이 아니면 "이메일 형식이 아닙니다", 맞으면 "사용가능" 출력
		// ex) indexOf는 특정 문자열을 찾아 인덱스를 반환하는데 없으면 -1을 리턴함.
		// 조건 : @ 포함이면 이메일형식
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이메일 주소를 입력하세요");
		System.out.println(">>>");
		String userEmail = scan.nextLine();
		int idx = userEmail.indexOf("@");
		String message = (idx == -1) ? ("email형식이 아닙니다") : ("사용가능");
		System.out.println(message);
		
		

	}

}
