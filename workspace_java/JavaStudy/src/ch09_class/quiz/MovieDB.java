package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {

		private ArrayList<Movie> movieList = new ArrayList<Movie>();
		// 싱글톤 패턴
		// 인스턴스를 1개만 만들게하는 방법 (최초에 한번만 메모리에 할당)
		// 메모리 낭비를 방지할 수 있으며, 단 하나의 객체로 존재해도 되는 클래스에 적용
		private MovieDB() {
			movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
			movieList.add(new Movie("기생충", "넌 계획이 다 있구나", "송강호", "ㄱㅅㅊ"));
			movieList.add(new Movie("올드보이", "누구냐, 넌?", "최민식", "ㅇㄷㅂㅇ"));
			movieList.add(new Movie("괴물", "아빠, 미안해", "송강호", "ㄱㅁ"));
			movieList.add(new Movie("암살", "나라를 위해서라면", "전지현", "ㅇㅅ"));
			movieList.add(new Movie("타짜", "나 이대 나온 여자야", "김혜수", "ㅌㅉ"));
			movieList.add(new Movie("부당거래", "우린 이쯤에서 그만하자", "류승범", "ㅂㄷㄱㄹ"));
			movieList.add(new Movie("친절한 금자씨", "너나 잘하세요", "이영애", "ㅊㅈㅎ ㄱㅈㅆ"));
			movieList.add(new Movie("도둑들", "모히또 가서 몰디브 한잔?", "김윤석", "ㄷㄷㄷ"));
			movieList.add(new Movie("범죄와의 전쟁", "살아있네!", "최민식", "ㅂㅈㅇㅇ ㅈㅈ"));
		}
		// 인스턴스 생성을 해당 클래스에서 하기 때문에 외부에서 인스턴스를 못만듬
		private static MovieDB instance = new MovieDB();
		
		// 외부에서 접근
		public static MovieDB getInstance() {
			return instance;
		}
		public ArrayList<Movie> getMovieList() {
			return movieList;
		}
		
}
