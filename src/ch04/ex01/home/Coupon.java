package ch04.ex01.home;

public class Coupon {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		if (grade == 1) coupon = "5만원";
		else if (grade == 2) coupon = "3만원";
		else coupon = "1천원";
		
		System.out.println(coupon);
	}
}
