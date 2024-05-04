package Pr;

public class Stars {
	public static void main(String[] args) {
		String stars = "";
		
		for(int i = 1; i <= 5; i++) {
			stars += "*";
			System.out.println(stars);
		}
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++)
//				stars += "*";
//			stars += "\n";
//		}
//		System.out.print(stars);
		
//		for(int i = 1; i <= 5; i++) {
//			stars += ("*" * i);
//			stars += "\n";
//			System.out.print(stars);
//		}
	}
}
