package ch06_method;
 
/**
 * class Name   : MethodMain
 * Author       : Jay
 * Created Date : 2024. 8. 8.
 * Version      : 1.0
 * Purpose      : method
 * Description  : java의 함수 클래스에 종속되어 있는 method
 */

public class MethodMain {
	
	// main 메소드 public이며 static하여 어디서든 사용 가능하고 void 리턴이 없는
	// 매개변수 한개 (String[] 배열타입)
	public static void main(String[] args) {
		printSum(1,100);
		int resultSum = returnSum(5,100);
		System.out.println(resultSum);
		print("프린트");
		print(resultSum);
		// Ctrl + 메소드 클릭 (메소드 선언 내용으로 이동)
		// Alt + 방향키 왼쪽 (이전 코드로 이동)
		System.out.println(factorial(10));
		System.out.println(factorial(15));
	}
	
	public static void printSum(int from, int to ) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.printf("from : %d 부터 to : %d 까지 합은 : %d \n", from, to, sum);
	}
	
	public static int returnSum (int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	// 메소드 오버로딩 동일한 이름의 메소드를 다른 입력과 다른 리턴으로 정의할 수 있음.
	public static void print(int msg) {
		System.out.println(msg);
	}

	// 펙토리얼 메소드를 만드시오
	// input : int
	// output : long
	
	public static long factorial(int input) {
		long fac = 1;
		for (int i = 1; i <= input; i++) {
			fac *= i;
		}
		return fac;
	}
	
}
