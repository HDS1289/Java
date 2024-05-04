package ch07.home.ex04.case01;

public class MaxMin {
	public static void main(String[] args) {
		int[] scores = {77, 88, 91, 33, 100, 55, 95};
		
		/*
		int max = scores[0]; // int type scores array의 첫 번째 인덱스 값으로 초기화하였다.
		int min = scores[0];
		for(int score: scores) {
			if(score > max) max = score;
			if(score < min) min = score;
		}
		*/
		
		int max = scores[0];
		int min = scores[0];
		for(int i = 0; i < scores.length; i++) {
			max = Math.max(max, scores[i]);
			min = Math.min(min, scores[i]);
		}
		
		System.out.printf("%d, %d", max, min);
	}
}
