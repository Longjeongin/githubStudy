package ch02_variable;

public class Casting {

	public static void main(String[] args) {
		int a = 10;
		double b = a; // 자동 형변환 작은단위 -> 큰단위
		double c = 10.5;
		int d = (int) c; // 명시적 형변환
		
		// 타입 변환
		// 정수 to 문자열
		int num = 123;
		String str = String.valueOf(num);
		
		// 문자열 to 정수
		String str2 = "123";
		int num2 = Integer.parseInt(str2);
		System.out.println(num);
		
		
	}
	
}