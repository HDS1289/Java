package ch07.ex04.case04;

public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores = {
				{90, 90, 90},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		System.out.println("번호 국어 수학 영어 합계 평균");
		System.out.println("-----------------------------");
		
		for(int i = 0; i < scores.length; i++) {   
			/*						  
			 * 전체가 다 출력되었을 때에는 
	         *  i 값이 5가 되어서 score.length와 같은 값이 되므로
			 *  반복문을 빠져나간다.
			 */
			int sum = 0;
			System.out.print(" " + (i + 1) + " "); // 번호가 출력된다.
			for(int j = 0; j < scores[0].length; j++) { // 0, 1, 2까지의 범위만을 가진다.
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}
			System.out.printf("%5d %4d\n", sum, sum / scores[0].length);
		}
	}
}
