package ch09_class.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		// movieDB는 싱글톤 패턴으로 디자인되어 있어
		// 외부에서 new를 할 수 없고 내부에서 생성되어진 하나의 인스턴스만을 사용할 수 있음
		MovieDB movieDB1 = MovieDB.getInstance();
		MovieDB movieDB2 = MovieDB.getInstance();
		System.out.println(movieDB1); // 객체의 주소가 같음 (동일한 객체)
		System.out.println(movieDB2);
		
		// 영화 맞추기 게임
		// 1. 명대사 출력 맞추면 score +1
		// 틀리면 2. 배우 출력
		// 틀리면 3. 영화명 초성 출력
		ArrayList<Movie> movieList = movieDB1.getMovieList();
		
		System.out.println(movieList.get(0));
		
		// collection shuffle (순서를 랜덤하게 섞음)
		Collections.shuffle(movieList);
		int score = 0;
		System.out.println("영화제목 맞추기를 시작합니다. 명대사로 맞추면 3점, 배우로 맞추면 2점, 초성으로 맞추면 1점이 주어집니다.");		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < movieList.size(); i++) {
			System.out.println("명대사 : " + movieList.get(i).getQuotes());
			String userinput = scanner.nextLine();
			if (userinput.equals(movieList.get(i).getTitle())) {
				System.out.println("정답입니다.");
				score += 3;
			}else {
				System.out.println("배우 : " + movieList.get(i).getActors());
				String userinput2 = scanner.nextLine();
				if (userinput2.equals(movieList.get(i).getTitle())) {
					System.out.println("정답입니다.");
					score += 2;
				}else {
					System.out.println("영화초성 : " + movieList.get(i).getWord());
					String userinput3 = scanner.nextLine();
					if (userinput3.equals(movieList.get(i).getTitle())) {
						System.out.println("정답입니다.");
						score += 1;
					}else {
						System.out.println("오답입니다. 정답은 '" + movieList.get(i).getTitle() + "' 입니다.");
					}
				}
			}
		}
		System.out.println("점수는 총 30점 중 " + score + "점 입니다.");
	}
}
