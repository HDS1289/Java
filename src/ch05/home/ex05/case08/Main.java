package ch05.home.ex05.case08;
/*
 * 최한석, 한아름, 양승일이 축구를 한다.
 * 최한석은 한아름에게 한아름은 양승일에게 공을 패스한다.
 * 양승일은 패스 받은 공을 찬다.
 */
public class Main {
	public static void main(String[] args) {
		Player player1 = new Player("최한석");
		Player player2 = new Player("한아름");
		Player player3 = new Player("양승일");
		Ball ball = new Ball();
		
		player3.kick(player2.pass(player1.pass(ball)));
	}
}
