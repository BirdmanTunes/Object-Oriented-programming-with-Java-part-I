package week3._076_Menu;

public class Main {

	public static void main(String[] args) {

		Menu firstMenu = new Menu();
		
		firstMenu.addMeal("Hamburger");
		firstMenu.addMeal("Fish'n'Chips");
		firstMenu.addMeal("Sauerkraut");
		
		firstMenu.printMeals();
		
		firstMenu.clearMenu();

		firstMenu.printMeals();
	}

}
