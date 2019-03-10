package week5._090_TeamAndPlayers;

import java.util.ArrayList;

public class Team {
	
	private String name;
	private int maxSize;
	private int size;
	private ArrayList<Player> list;
	
	public Team(String name) {
		this.name = name;
		maxSize = 16;
		size = 0;
		list = new ArrayList<Player>();
	}
	
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public String getName() {
		return name;
	}
	
	public void addPlayer(Player name) {
		if (size < maxSize) {
			list.add(name);
			size++;
		}
	}
	
	public int size() {
		return size;
	}
	
	public void printPlayers() {
		for (Player each:list) {
			System.out.println(each);
		}
	}
	
	public int goals() {
		int goals = 0;
		for (Player each:list) {
			goals += each.getGoals();
		}
		return goals;
	}
}
