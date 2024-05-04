package ch02.ex02;

import java.time.LocalDate;
import java.time.LocalTime;

public class C07Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025, 3, 6);
		LocalTime time = LocalTime.of(14, 35, 24);
		
		System.out.println(date);
		System.out.println(time);
	}
}
