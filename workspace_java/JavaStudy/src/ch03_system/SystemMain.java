package ch03_system;

/**
 * class Name   : SystemMain
 * Author       : Jay
 * Created Date : 2024. 8. 6.
 * Version      : 1.0
 * Purpose      : system class study
 * Description  : 표준 입출력
 */


public class SystemMain {

	public static void main(String[] args) {
		System.out.print("hi");
		System.out.print("hi"); // print, 이어서 출력

		System.out.println("hello");
		System.out.println("hello"); // println 줄바꿈
		
		System.err.println("오류입니다"); // err 빨간글씨
		
		// 이스케이프 문자 사용 (문자열 내 특수한 기능을 수행하기 위해 사용하는 문자
		// \n 개행(줄바꿈), \t 탭
		System.out.println("Hello \nWorld");
		// \" 문자열로써의 쌍따옴표
		System.out.println(" \"안녕\" ");
		
		// printf 문자열 포멧 형태로 줄력
		System.out.printf("원주율은 %.2f \n", 3.141592);
		System.out.printf("%d 명이 %s 를 듣고 있습니다.", 18, "java수업");
		
		
	}
}
