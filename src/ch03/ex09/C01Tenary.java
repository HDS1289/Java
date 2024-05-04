package ch03.ex09;

public class C01Tenary {
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? y : -y; // 주어진 정수가 0보다 크면 그 값을 그대로 할당하고 그렇지 않으면 -1을 곱하여 할당하라.
		
		System.out.printf("absX: %d, absY: %d\n", absX, absY);
	}
}
