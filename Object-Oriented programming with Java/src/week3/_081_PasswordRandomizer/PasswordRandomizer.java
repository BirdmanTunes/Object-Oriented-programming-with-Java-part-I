package week3._081_PasswordRandomizer;

import java.util.Random;

public class PasswordRandomizer {
	private Random rand;
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.rand = new Random();
    }

    public String createPassword() {
    	
    	String password = "";
    	
    	for (int i = 0; i < length; i++) {
    		int number = rand.nextInt(26);
    		char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
    		password += symbol;
    	}
    	return password;
    }
}