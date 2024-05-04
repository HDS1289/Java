package ch03.ex09;

public class C02Grade {
	public static void main(String[] args) {
		int score = 50;
		
//		String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
//		
//		System.out.printf("grade: %s\n", grade);
		
		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'C';
		
		System.out.printf("grade: %c\n", grade);
	}
}
