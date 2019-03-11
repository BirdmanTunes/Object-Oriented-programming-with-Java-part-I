package week6._100_NightSky;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		NightSky NightSky = new NightSky(0.1, 40, 10);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		System.out.println("");

		NightSky = new NightSky(0.2, 15, 6);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
	}
}
