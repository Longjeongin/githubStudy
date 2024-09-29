package practice.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		accountApplication();
	}
	
	public static void accountApplication() {
		Scanner scan = new Scanner(System.in);			
		ArrayList<Account> accountList = new ArrayList<Account>();
		while (true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			String select = scan.nextLine();
			if(select.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}else if (select.equals("1")) {
				System.out.println("-----------------------------------------------");
				System.out.print("계좌생성");
				System.out.println("\n-----------------------------------------------");
				System.out.print("계좌번호 : ");
				String inputNumber = scan.nextLine();
				System.out.print("계좌주 : ");
				String inputName = scan.nextLine();
				System.out.print("초기입금액 : ");
				int inputMoney = Integer.parseInt(scan.nextLine());
				accountList.add(new Account(inputNumber, inputName, inputMoney));
				System.out.println("결과 : 계좌가 생성되었습니다.");
			}else if(select.equals("2")) {
				System.out.println("-----------------------------------------------");
				System.out.println("계좌목록");
				System.out.println("-----------------------------------------------");
				for (int i = 0; i < accountList.size(); i++) {
					System.out.println(accountList.get(i));
				}
			}else if(select.equals("3")) {
				System.out.println("-----------------------------------------------");
				System.out.println("예금");
				System.out.println("-----------------------------------------------");
				System.out.print("계좌번호 : ");
				String inputNumber = scan.nextLine();
				System.out.print("예금액 : ");
				int inputMoney = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < accountList.size(); i++) {
					if (inputNumber.equals(accountList.get(i).getAccountNumber())) {
						int accountMoney = accountList.get(i).getMoney() + inputMoney;
						accountList.get(i).setMoney(accountMoney);
						break;
					}
					System.out.println("해당 계좌는 존재하지 않습니다.");
				}
			}else if(select.equals("4")){
				System.out.println("-----------------------------------------------");
				System.out.println("출금");
				System.out.println("-----------------------------------------------");
				System.out.print("계좌번호 : ");
				String inputNumber = scan.nextLine();
				System.out.print("출금액 : ");
				int inputMoney = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < accountList.size(); i++) {
					if (inputNumber.equals(accountList.get(i).getAccountNumber())) {
						int accountMoney = accountList.get(i).getMoney() - inputMoney;
						accountList.get(i).setMoney(accountMoney);
						break;
					}
					System.out.println("해당 계좌는 존재하지 않습니다.");
				}
			}
		}
		scan.close();
	}
	



}
