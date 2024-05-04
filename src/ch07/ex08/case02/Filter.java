package ch07.ex08.case02;

import java.util.stream.IntStream;

public class Filter {
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);
		
		stream.filter((i) -> (i % 2) == 0)
			.forEach(System.out::println);
		System.out.println();
		
		stream = IntStream.range(1, 10);
		stream.filter((i) -> i % 2 == 0) // return type이 boolean이다.
			.map((i) -> i * 10)
			.forEach(System.out::println);
	}
}
