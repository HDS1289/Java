package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		
		if (0 < a && a < 4) System.out.println("good.");
		
		char b = 'b';
		if ('a' < b && b < 'c') System.out.println("Good.");
		
		int x = 0;
		int y = 0;
		
		if ((x = 1 + 2) > 0 || (y = 1 - 2) < 0)
			System.out.printf("\nx: %d\ny: %d\n", x, y);
		
		String s = "he";
		if (s.equals("he")) 
			System.out.println("he");
		
		s = "he";
		if (s.equals("He"))
			System.out.println("he");
		
		s = "he";
		if (s.equalsIgnoreCase("He")) 
			System.out.println("he");
		
		s = "";
		if (s.equals("")) System.out.println("값이 없다.");
		
		s = "hello";
		if (!s.equals("")) System.out.println("값이 있다.");
		
		boolean power = false;
		if (!power) System.out.println("전원을 켜다.");
	}
}
