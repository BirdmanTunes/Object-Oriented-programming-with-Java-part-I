package week6._103_BirdwatchersDatabase;

import java.util.ArrayList;

public class Database {
	
	private ArrayList<Bird> birdBase;
	
	public Database() {
		birdBase = new ArrayList<Bird>();
	}
	
	public void add(Bird newBird) {
		birdBase.add(newBird);
	}
	
	public void show(String searched) {
		for (Bird each:birdBase) {
			if (each.getName().toUpperCase().contains(searched.toUpperCase()) ||
				each.getLatinName().toUpperCase().contains(searched.toUpperCase())) {
				System.out.println(each);
			}
		}
	}
	
	public void stats() {
		for (Bird each: birdBase) {
			System.out.println(each);
		}
	}
	
	public void observed(String searched) {
		
		int birds = 0;
		for (Bird each:birdBase) {
			if (each.getName().toUpperCase().contains(searched.toUpperCase()) ||
				each.getLatinName().toUpperCase().contains(searched.toUpperCase())) {
				each.setObservation();
				birds++;
			}
		}
		if (birds == 0) {
			System.out.println("It's not a bird.");
		}
	}
}
