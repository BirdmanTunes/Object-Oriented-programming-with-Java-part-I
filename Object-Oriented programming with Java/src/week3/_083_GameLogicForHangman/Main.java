package week3._083_GameLogicForHangman;

public class Main {

	public static void main(String[] args) {
		
		HangmanLogic logic = new HangmanLogic("parameter");
		HangmanUserInterface game = new HangmanUserInterface(logic);
		game.start();
	}

}
