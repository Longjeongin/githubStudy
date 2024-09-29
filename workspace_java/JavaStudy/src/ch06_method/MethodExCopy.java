package ch06_method;

public class MethodExCopy {

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
		makeCard("팽스", 80, 70, 100);
	}
	
	public static void makeCard (String nm, int ko, int ma, int en) {
		double average = (ko + ma + en) / 3.0;
		if (average >= 90) {
			System.out.printf("%s님의 평균은 %.2f으로 A등급 입니다. \n", nm, average);
		}else if (average >= 80) {
			System.out.printf("%s님의 평균은 %.2f으로 B등급 입니다. \n", nm, average);
		}else {
			System.out.printf("%s님의 평균은 %.2f으로 C등급 입니다. \n", nm, average );
		}
		
	}
}
