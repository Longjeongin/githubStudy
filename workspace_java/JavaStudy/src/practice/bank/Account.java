package practice.bank;

public class Account {
	
	private String accountNumber;
	private String name;
	private int money;
	
	public Account(String accountNumber, String name, int money) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.money = money;
	}

	@Override
	public String toString() {
		return accountNumber + "   " + name + "   " + money;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

	
	
	
}
