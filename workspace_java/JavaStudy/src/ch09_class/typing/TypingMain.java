package ch09_class.typing;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingMain {

	public static void main(String[] args) {
		int num;
		// args <-- 해당 메인메서드 실행시 입력값이 있으면 args에 담김
		// ex) java TypingMain 1   <-- TypingMain 호출시 매개변수로 1 사용
		if(args.length > 0) {
			num = Integer.parseInt(args[0]);
		}else {
			num = Dictionary.OPTION_STUDENT_NAME;
		}
		System.out.println(num + " select");
		Scanner scan = new Scanner(System.in);
		ArrayList <String> wordList = Dictionary.makeWordList(num);
		
		// 현재 시간
		long before = System.currentTimeMillis(); // UTC 기준시 밀리
		int correctCount = 0;
		int incorrectCount = 0;
		while (true) {
			// 단어중 랜덤하게 선택
			int randIdx = (int) (Math.random() * wordList.size());
			System.out.println(wordList.get(randIdx));
			System.out.print(">>>");
			String input = scan.nextLine();
			
			// 입력 단어와 문제 단어가 일치하면 삭제
			if (wordList.get(randIdx).equals(input)) {
				wordList.remove(randIdx);
				correctCount ++;
			}else {
				wordList.remove(randIdx);
				incorrectCount ++;
			}
			// 단어가 없으면 종료
				
			if (wordList.size() == 0) {
				break;
			}
		
		}
		long after = System.currentTimeMillis();
		long diff = after - before; // 소요시간
		double result = diff / 1000.0; // 초 변환
		System.out.println("맞춘 횟수 : " + correctCount + 
						   ", 틀린 횟수 : " + (incorrectCount));
		System.out.println(result + "초 걸리셨습니다.");
		
	}

}
