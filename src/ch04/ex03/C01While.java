package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 100;
		int jmprpCnt = 0; // 줄넘기 횟수.
		
		while (weight > 60) { // 몸무게를 60kg로 줄이고자 한다.
			jmprpCnt++;
			weight--;
		}
		System.out.printf("%d번 줄넘기하여 %dkg로 줄였습니다.", jmprpCnt, weight);
	}
}
