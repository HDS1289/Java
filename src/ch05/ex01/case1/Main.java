package ch05.ex01.case1;

public class Main {
	public static void main(String[] args) {
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		hour = 12; minute = 34; second = 50;
		
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time = new Time();
		
		time.hour = 12;
		time.minute = 45;
		time.second = 35;
		
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		System.out.println(time);
		System.out.println(time.toString());
	
		
		Time time2 = new Time();
		
		time2.hour = 15;
		time2.minute = 30;
		time2.second = 48;
		
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		System.out.println(time2);
	}
}
