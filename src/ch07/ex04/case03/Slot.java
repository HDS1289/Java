package ch07.ex04.case03;

public class Slot {
	private Ball[] balls;
	
	public Slot() {
		balls = new Ball[45]; // 슬롯 안에는 공이 45개 들어갈 수 있다.
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1);
	}
	
	/*
	public Ball chuck() {
		return balls[(int)(Math.random() * 45) + 1];
	}
	*/
	
	public Ball chuck() {
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45);
			ball = balls[i];
			balls[i] = null;
		} while(ball == null);
		
		return ball;
	}
}
