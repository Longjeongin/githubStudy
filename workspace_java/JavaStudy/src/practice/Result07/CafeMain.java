package practice.Result07;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		buyCoffee();
		
		
		
	}

	public static void buyCoffee() {
		ArrayList<Coffee> starbucksMenu = new ArrayList<>() ;
		Cafe starbucks = new Cafe("starbucks", starbucksMenu);
		starbucks.addCoffee("아메리카노", 5000);
		starbucks.addCoffee("카푸치노", 6000);
		starbucks.addCoffee("오곡라떼", 7000);
		ArrayList<Coffee> akaMenu = new ArrayList<>() ;
		Cafe akaCafe = new Cafe("akaCafe", akaMenu);
		akaCafe.addCoffee("아메리카노", 2500);
		akaCafe.addCoffee("바닐라라떼", 3000);
		akaCafe.addCoffee("아이스티", 3500);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 방문 | 2. 아카 방문 | 3. 사무실 복귀");
			System.out.print(">>>");
			String userInput = scanner.nextLine();
			int userChoice = Integer.parseInt(userInput);
			if (userChoice == 3) {
				System.out.println("사무실로 복귀합니다.");
				break;
			}else if (userChoice == 1){
				System.out.println("어서오세요 스타벅스 입니다.");
				starbucks.showMenu();
				System.out.println("메뉴를 선택해주세요.");
				System.out.print(">>>");
				String userInput2 =  scanner.nextLine();
				int userChoice2 = Integer.parseInt(userInput2);
					System.out.println(starbucks.coffeeMenu.get(userChoice2-1).getName() + "를 " +  
									   starbucks.coffeeMenu.get(userChoice2-1).getPrice() + "원에 구매했습니다.\n");
			}else if(userChoice == 2) {
				System.out.println("어서오세요 아카 입니다.");
				akaCafe.showMenu();
				System.out.println("메뉴를 선택해주세요.");
				System.out.print(">>>");
				String userInput2 =  scanner.nextLine();
				int userChoice2 = Integer.parseInt(userInput2);
					System.out.println(akaCafe.coffeeMenu.get(userChoice2-1).getName() + "를 " +  
									   akaCafe.coffeeMenu.get(userChoice2-1).getPrice() + "원에 구매했습니다.\n");
			}
		}
		scanner.close();
	}
}
