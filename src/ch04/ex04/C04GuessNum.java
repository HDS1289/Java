package ch04.ex04;
/*
 * 숫자 맞히기 게임이다.
 * 한 사람이 숫자를 말하면 상대방은 숫자가 틀릴 경우, 생각하고 있는 숫자와 비교하여 Up 또는 Down을 말할 수 있다.
 * 예상하고 있는 숫자보다 작을 경우 Up, 예상하고 있는 숫자보다 클 경우 Down이다.
 * 숫자를 맞힐 경우 그대로 게임은 종료된다.
 */

import java.util.Scanner;

public class C04GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int guess = 0;
		int target = 0;
		int tries = 0;
		String msg = "";
		target = (int)(Math.random() * 1000) + 1; // target은 고정된 값이어야 한다.
		// 반복문 블록 안에 있으면 loop가 한 번 돌 때마다 매번 새로운 난수가 생성된다.
		do {
			System.out.print("숫자를 맞혀보세요: ");
			guess = sc.nextInt();
			tries++;
			if (guess > target) msg = "Down";
			else if (guess < target) msg = "Up";
			else msg = "Correct";
			System.out.println(msg);
		} while (guess != target);
		System.out.printf("%d번만에 %d을 맞혔습니다.", tries, target);
	}
}
