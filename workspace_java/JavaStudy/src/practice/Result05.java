package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Result05 {

	public static void main(String[] args) {
		// 로또번호 생성 메서드 1 ~ 45까지 랜덤숫자 6개를 오름차순으로 출력
		// makeLotto() 중복 x
		ArrayList<Integer> weekLotto = null;
		weekLotto = makeLotto();
		System.out.println(weekLotto.toString());
		System.out.println("행운을 빕니다");
		// 상황1 n을 입력하면 전체 자동생성
		// 상황2 y를 입력하고 4 10 과같이 띄어쓰기로 입력

	}
	public static ArrayList<Integer> makeLotto() {
		System.out.println("행운의 로또 번호 생성기입니다.");
		System.out.println("입력 값이 있으면 'y', 전체 자동으로 선택하려면 'n'을 입력하세요");
		System.out.println(">>>");
		Scanner scan = new Scanner(System.in);
		String userInput1 = scan.nextLine();
		ArrayList<Integer> numArr2 = new ArrayList<Integer>();
		if (userInput1.equals("n")) {
			System.out.println("이번 주 행운의 번호는");
			return makeLotto("n");
		}else if(userInput1.equals("y")) {
			System.out.println("번호를 한칸 씩 띄어서 입력해주세요.");
			String userInput2 = scan.nextLine();
			String [] numArr = userInput2.split(" ");
			for (int i = 0; i < numArr.length; i ++) {
				numArr2.add(Integer.parseInt(numArr[i])); 
				}
			System.out.println("이번 주 행운의 번호는");
			return makeLotto("y", numArr2);
		}
		return makeLotto();
		}
	
	public static ArrayList<Integer> makeLotto(String yesORno) {
		HashSet<Integer> lottoNumber = new HashSet<Integer>();
		if (yesORno.equals("n")) {
			for (int i = 0; i < 7; i++) {
				int randomNumber = (int) (Math.random() * 45) + 1;
				lottoNumber.add(randomNumber);
			}
		}
		ArrayList<Integer> lottoNumberfn = new ArrayList<Integer>(lottoNumber);
		Collections.sort(lottoNumberfn);
		return lottoNumberfn;
	}
	public static ArrayList<Integer> makeLotto(String yesORno, 
									 ArrayList<Integer> Arr) {
		HashSet<Integer> lottoNumber = new HashSet<Integer>();
		if (yesORno.equals("y")) {
			for (int i = 0; i < Arr.size(); i++) {
				int ArrInt = Arr.get(i);
				lottoNumber.add(ArrInt);
			}
			for (int i = 0; i < 6 - Arr.size(); i++) {
				int randomNumber = (int) (Math.random() * 45) + 1;
				lottoNumber.add(randomNumber);
			}
		}
		ArrayList<Integer> lottoNumberfn = new ArrayList<Integer>(lottoNumber);
		Collections.sort(lottoNumberfn);
		return lottoNumberfn;
		} 
	}