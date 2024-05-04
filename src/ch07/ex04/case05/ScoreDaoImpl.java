package ch07.ex04.case05;

public class ScoreDaoImpl implements ScoreDao {
	private Score[] scores; // database역할을 할 객체를 준비한다.
	private int cursor; // 몇 번째 score인지를 가리키는 cursor를 준비한다.(index)
	
	public ScoreDaoImpl(Score[] scores) {
		this.scores = scores;
	}
	
	@Override
	public void insertScore(Score score) { // scores[0]의 값부터 score값이 할당된다.
		this.scores[cursor++] = score; 
	}
	
	@Override
	public Score[] selectScores() {
		return this.scores;
	}
}
