package ch07.ex04.case05;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl() {}
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores);
		return scores;
	}
	
	public void calcScore(Score[] scores) {
		for(int i = 0; i < scores.length; i++) {
			scores[i].setSum(scores[i].getKor() +
							 scores[i].getEng() +
					         scores[i].getMath());
			scores[i].setAvg(scores[i].getSum() / 3);
		}
	}
}
