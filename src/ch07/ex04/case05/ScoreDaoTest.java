package ch07.ex04.case05;

public class ScoreDaoTest {
	public static void main(String[] args) {
		// 테스트를 하기 위하여 미리 준비해 놓은 data ==> fixture
		Score score1 = new Score(100, 100, 100);
		Score score2 = new Score(10, 10, 10);
		
		Score[] scores = new Score[2]; // 국어, 영어, 수학 점수를 받은 레코드 한 줄이 원소 한 개가 된다.
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		
		scoreDao.insertScore(score1);
		scoreDao.insertScore(score2);
		
		scoreDao.selectScores();
		for(Score score: scores) System.out.println(score);
	}
}
