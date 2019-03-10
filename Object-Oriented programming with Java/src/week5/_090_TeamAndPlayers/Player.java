package week5._090_TeamAndPlayers;

public class Player {
	
	private String name;
	private int goals;
	
	public Player(String name, int goals) {
		this.name = name;
		this.goals = goals;
	}
	
	public Player (String name) {
		this(name, 0);
	}
	
	public String getName() {
		return name;
	}
	
	public int getGoals() {
		return goals;
	}
	
	public String toString() {
		return name + ", goals " + goals;
	}
}
