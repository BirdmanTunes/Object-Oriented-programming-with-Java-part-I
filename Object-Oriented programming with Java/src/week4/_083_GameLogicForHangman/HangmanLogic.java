package week4._083_GameLogicForHangman;

public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
    	
    	if (guessedLetters.contains(letter)) {
    		
    	} else if (word.contains(letter)) {
    		guessedLetters += letter;
    	} else {
    		numberOfFaults++;
    		guessedLetters += letter;
    	}
    }

    public String hiddenWord() {
    	
    	String hidden = "";
    	for (int i = 0; i < word.length(); i++) {
    		String aString = "" + word.charAt(i);
    		if (guessedLetters.contains(aString)) {
    			hidden += word.charAt(i);
    		} else {
    			hidden += "_";
    		}
    	}

        return hidden;
    }
}