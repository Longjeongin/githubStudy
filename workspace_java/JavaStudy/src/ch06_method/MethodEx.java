package ch06_method;

public class MethodEx {

	public static void main(String[] args) {
		// 이름, 국어점수, 수학점수, 영어점수를 입력받아
		// 평균과 등급을 출력하는 메소드를 작성하시오
		// input : String, int, int, int
		// output : 없음
		// 등급은 평균 90이상 A, 80이상 B, 나머지 C
		// 출력) xxx님의 평균은 (소수점 2자리까지)으로 y등급 입니다.

		// 함수 호출 예
		// makeCard("팽수", 100, 100, 100);ㅣ
		// 팽수님의 평균은 100.0으로 A등급 입니다.
		makeCard("팽수", 100, 100, 100);
	}

	public static void makeCard2 (String nm2, int kr2, int ma2, int en2) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void makeCard (String nm, int ko, int ma, int en) {
		double average = (ko + ma + en) / 3.0;
		String grade = "C";
		if (average >= 90) {
			grade = "A";
		}else if (average >= 80) {
			grade = "B";
		}System.out.printf("%s님의 평균은 %.2f으로 %s 등급입니다.", nm, average, grade);
		
	}
}
