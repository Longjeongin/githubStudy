package practice;

public class Result02 {

	public static void main(String[] args) {
		// Q.2 10팩토리얼 15팩토리얼
		// 1x2x3x4x5
		long result =1;
		for(int i =1; i <= 15; i++) {
			result *=i;
		}
		System.out.println(result);
	}

}
