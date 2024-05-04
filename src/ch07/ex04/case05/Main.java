package ch07.ex04.case05;

public class Main {
	public static void main(String[] args) {
		ScoreDao scoreDao = new ScoreDaoImpl(new Score[5]); // 5명의 학생 성적을 입력 및 조회하는 것이므로 원소의 갯수가 정해져 있는 것으로 설정되었다.
		ScoreService scoreService = new ScoreServiceImpl(scoreDao); // 노동자 관리를 하는 것은 원소의 갯수가 정해지지 않은 것이다.
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play();
	}
}
