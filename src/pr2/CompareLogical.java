package pr2;

public class CompareLogical {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println((x > 7) && (y <= 5)); // true
		System.out.println((x % 3 == 0) || (y % 2 != 1)); // false
	}
}
