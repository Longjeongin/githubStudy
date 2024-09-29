package practice;

import java.util.Scanner;

/**
 * class Name   : Result01
 * Author       : Nick
 * Created Date : 2024. 8. 6.
 * Version      : 1.0
 * Purpose      :
 * Description  :
 */
public class Result01 {
	/*
	 * q1.사용자로부터 국어, 영어, 수학 점수를 각각 입력받아 평균점수를 구하고, 
	 *    등급을 출력해주세요.
	 * 등급조건: 평균점수가 90점 이상이면 A, 80점 이상 B, 70점 이상 C, 나머지 D
	 * */
	public static void main(String[] args) {
			/// 1. 입력을 받고
			Scanner scan = new Scanner(System.in);
			System.out.print("국어 점수 입력 >>");
			String korean = scan.nextLine();
			System.out.print("영어 점수 입력 >>");
			String english = scan.nextLine();
			System.out.print("수학 점수 입력 >>");
			String math = scan.nextLine();
			int intKor = Integer.parseInt(korean);
			int intEng = Integer.parseInt(english);
			int intMath = Integer.parseInt(math);
			/// 2. 입력받아서 평균 계산.
			double avg = ( intEng + intKor + intMath ) / 3.0 ;
		    /// 3. 조건식
			String grade = "";
			if(avg >= 90) {
				grade = "A";
			}else if(avg >= 80){
				grade = "B";
			}else if(avg >= 70){
				grade = "C";
			}else {
				grade = "D";
			}
			/// 4. 출력 
			System.out.println("평균 :" + avg);
			System.out.println("등급 :" + grade);
			
			
		
	}
}
