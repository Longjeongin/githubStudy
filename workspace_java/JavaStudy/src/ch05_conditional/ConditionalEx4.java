package ch05_conditional;

public class ConditionalEx4 {

	public static void main(String[] args) {
		/* 거꾸로 트리 5층 만들기
		 * 실행결과
		 *****
		 ****
		 ***
		 **
		 *
		  
		 */
		String star = "*****";
		// 반복문 사용
		int starNm = star.length();
	
		while (starNm >=0) {
			String star2 = star.substring(0,starNm);
			System.out.println(star2);
			starNm--;
		}

		for (int i = 5 ;i > 0; i--) {
			String subStar = star.substring(0,i);
			System.out.println(subStar);
		}

		for (int i = 5 ;i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
