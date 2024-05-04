package Pr;

public class Grade {
	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		
		if (grade == "A") score1 = 100;
		else if (grade == "B") {
			int result = 100 - 20;
			score1 = result;
		} else score1 = 60;
		
		System.out.println(score1);
	}
}
