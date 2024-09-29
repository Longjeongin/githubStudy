package ch05_conditional;

public class ConditionalEx2 {

	public static void main(String[] args) {
		// 각자리 수의 더한 값을 출력하시오
		// 출력결과 : 2 + 9 + 8 = 19
		// ex) 문자열로 한자리씩 or 각 자리를 나눠서
		// 문자열로 형변환은 String.valueOf(숫자) or 숫자 + ""
		int num = 298;
		String strEx = num + "";
		int result = Integer.parseInt(strEx.substring(0,1))
				   + Integer.parseInt(strEx.substring(1,2))
		           + Integer.parseInt(strEx.substring(2,3));
		System.out.println(result);
		
		int hundreds = num / 100;
		int tens = (num / 10) % 10;
		int ones = num % 10;
		int sum = hundreds + tens + ones;
		System.out.println(sum);
		
		
/*		String numS = num + "";
		int num1 = Integer.parseInt(numS.substring(0,1)); 
		int num2 = Integer.parseInt(numS.substring(1,2)); 
		int num3 = Integer.parseInt(numS.substring(2,3)); 
		System.out.println(num1 + num2 + num3); */
	}
	
	
	
	
	

}
