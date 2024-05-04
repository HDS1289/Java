package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int days = 0;
		String weekDay = "";
		
		weekDay = switch(days) {
		case 1 -> "Sunday";
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		default -> "Saturday";
		};
		
		System.out.println(weekDay);
	}
}
