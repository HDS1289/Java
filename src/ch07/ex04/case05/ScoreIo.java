package ch07.ex04.case05;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	/*
	public void play() {
		Score[] scores = new Score[5];
		
		for(int i = 0; i < scores.length; i++) {
			scoreService.addScore(
					new Score((i + 1) * 10, (i + 1) * 10, (i + 1) * 10));
		}
		
		scores = scoreService.getScores();
		for(Score score: scores) System.out.println(score);
	}
	*/
	
	public void play() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = 0; i < 5; i++) {
			kor = Console.inNum("국어");
			eng = Console.inNum("영어");
			math = Console.inNum("수학");
			
			scoreService.addScore(new Score(kor, eng, math));
		}
		
		Score[] scores = scoreService.getScores();
		for(Score score: scores) Console.info(score);
		
	}
}
