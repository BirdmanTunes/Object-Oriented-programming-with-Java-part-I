package week6._100_NightSky;

import java.util.Random;

public class NightSky {
	
	Random rand;
	private double density;
	private int width;
	private int height;
	private int starCounter;
	
	public NightSky(double density) {
		this(density, 20, 10);
	}
	
	public NightSky(int width, int height) {
		this(0.1,width,height);
	}
	
	public NightSky(double density, int width, int height) {
		this.density = density;
		this.width = width;
		this.height = height;
		rand = new Random();
	}
	
	public int starsInLastPrint() {
		return starCounter;
	}
	
	public void print() {
		for (int i=0; i<height;i++ ) {
			printLine();
			System.out.println("");
		}
	}
	
	public void printLine() {
		double number = rand.nextDouble();
		for(int i=0; i < width; i++){
			number = rand.nextDouble();
			if (number <= density) {
				System.out.print("*");
				starCounter++;
			}
			else {
				System.out.print(" ");
			}
		}
	}
}
