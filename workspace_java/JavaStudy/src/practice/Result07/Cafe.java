package practice.Result07;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

	String name;
	ArrayList<Coffee> coffeeMenu = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public Cafe() {
		super();
	}
	public Cafe(String name) {
		super();
		this.name = name;
	}
	public Cafe(String name, ArrayList<Coffee> coffeeMenu) {
		super();
		this.name = name;
		this.coffeeMenu = coffeeMenu;
	}
	@Override
	public String toString() {
		return "Cafe [name=" + name + ", coffeeMenu=" + coffeeMenu + "]";
	}
	
	
	public void addCoffee(String name, int price) {
		coffeeMenu.add(new Coffee(name, price));
	}
	
	public void showMenu() {
		for (int i = 0; i < coffeeMenu.size(); i++) {
			System.out.println((i+1) + ". " + coffeeMenu.get(i));
		}
	}
	
	public void buyCoffee() {
		String userInput = scanner.nextLine();
		int userChoice = Integer.parseInt(userInput);
		System.out.println(coffeeMenu.get(userChoice -1));
	}
	
}
