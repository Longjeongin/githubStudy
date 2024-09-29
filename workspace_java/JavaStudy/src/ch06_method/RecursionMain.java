package ch06_method;

/**
 * class Name   : RecursionMain
 * Author       : Jay
 * Created Date : 2024. 8. 8.
 * Version      : 1.0
 * Purpose      : method
 * Description  : recursionMain
 */

public class RecursionMain {

	public static void main(String[] args) {
		System.out.println(recFactorial(10));
		Func(10);
		

	}
	//  factorial 재귀함수 사용
	public static long recFactorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * recFactorial(num-1);
		/*
		 * 3을 입력 받았다면
		 * 3 * recFactorial(2)
		 * 3 * 2 * recFactorial(1) -> 1
		 * */
	}
//	public static void Func(int num) {
//		System.out.println("hi");
//		Func(num - 1);
//	}
//  멈추는 조건이 없어 무한루프
	
	public static void Func(int num) {
		if (num == 0) {
			return;
		}else {
		System.out.println("hi");
		Func(num - 1);
		}
	}
	
}
