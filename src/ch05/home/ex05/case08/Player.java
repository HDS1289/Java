package ch05.home.ex05.case08;

public class Player {
	private String playerName;
	
	public Player(String playerName) {
		this.playerName = playerName;
	}
	
	public Ball pass(Ball ball) {
		return ball;
	}
	
	public Ball kick(Ball ball) {
		return ball;
	}
}
