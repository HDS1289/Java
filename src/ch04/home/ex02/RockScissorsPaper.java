package ch04.home.ex02;
/*
 * 앱과 가위바위보를 하고 게임 결과를 출력하라.
 * 결과는 You win, You lose, Fair 중 하나이다.
 */
import java.util.Scanner;

public class RockScissorsPaper { // player와 com이 맞대결을 펼친다. player는 숫자를 입력하고, com은 난수를 생성한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int playerInput = 0;
		int cpuRnd = 0;
		String playerOutput= "";
		String cpuOutput = "";
		String result = "";
		
		System.out.print("1.가위, 2.바위, 3.보 \n> ");
		playerInput = sc.nextInt();
		cpuRnd = (int)(Math.random() * 3) + 1;
		
		playerOutput = switch(playerInput) {
		case 1 -> "가위";
		case 2 -> "바위";
		case 3 -> "보";
		default -> "Give up?";
		};
		
		cpuOutput = switch(cpuRnd) {
		case 1 -> "가위";
		case 2 -> "바위";
		default -> "보";
		};
		
		if(1 <= playerInput && playerInput <= 3) {
			result = switch(playerInput - cpuRnd) { // 핵심 알고리즘 ==> 사용자와 com이 가위, 바위, 보를 내는 것을 숫자로 변환한 것이다.
			case 1, -2 -> "You win.";               // 세 가지 경우에 대응되는 숫자의 차이를 통하여 승패를 판단하는 알고리즘이다.
			case -1, 2 -> "You lose.";
			default -> "Draw.";
			};
			System.out.printf("\nYou: %s\n", playerOutput);
			System.out.printf("Me: %s\n", cpuOutput);
			System.out.println(result);
			
		} else {
			System.out.println(playerOutput);
			System.out.println("1, 2, 3 중에서 입력하세요.");
		}
	}
}
