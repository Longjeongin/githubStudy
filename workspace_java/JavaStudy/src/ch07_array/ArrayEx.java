package ch07_array;

public class ArrayEx {

	public static void main(String[] args) {
		// 문자편집 단축기 : shift + alt + a


		// 1. 우리반 학생들의 이름이 담긴 string [] 선언
		String[] students = { "강민호", "권철규", "김윤아", "김정인", "김혜원", 
							  "박정호", "서원빈", "안서령", "이소희", "이승욱", 
							  "이원호", "전영범", "전종화", "정도현", "최대준", 
							  "최지은", "한준희"};
		// 우리반 학생들이 이름 출력
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		// 학생들의 이름에 출석부 순번을 붙여주세요 1.강민호, 2.권철규 ....
//		for (int i = 0; i < students.length; i++) {
//			students[i] = (i+1) + ". " + students[i];
//			System.out.println(students[i]);
//		}
		searchNm("김", students);
		searchNm("이", students);
		searchNm("박", students);
	}
		
		// Q. 같은 성 찾기 메소드를 작성해주세요
		// input : String, String[]
		// output : x
		// 전달받은 배열에서 전달받은 성씨의 인원수를 출력하시오
		// 호출 : searchNm ("이", students)
		// 출력 : '이'씨 성을 가진 동기분은 총 3명 있습니다
		//         이소희, 이승욱, 이원호 씨

	public static void searchNm (String nm, String[] stu) {
		int count = 0;
		for (int i = 0; i < stu.length; i++) {
			String firstNm = stu[i].substring(0, 1);
			if(firstNm.equals(nm)) {
				count += 1;
			}
		}
		System.out.println(nm+"씨 성을 가진 동기분은 총 "+ count + "명 있습니다.");
		for (int i = 0; i < stu.length; i++) {
			String firstNm = stu[i].substring(0, 1);
			if(firstNm.equals(nm)) {
				System.out.print(stu[i]+"씨 ");
		}
		}
		System.out.println("\n===================");
	}

}
