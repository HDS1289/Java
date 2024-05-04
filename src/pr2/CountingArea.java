package pr2;

public class CountingArea {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)(lengthTop + lengthBottom) * height / 2;
		// (double)((lengthTop + lengthBottom) * height / 2) ==> 정수 타입부터 계산이 된 다음에 casting이 나중에 이루어진다.
		System.out.println(area);
	}
}
