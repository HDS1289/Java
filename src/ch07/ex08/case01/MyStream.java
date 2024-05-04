package ch07.ex08.case01;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		Stream<Integer> stream = list.stream();
		
		Integer[] arr = {1, 2, 3};
		stream = Arrays.stream(arr);
		stream = Arrays.stream(arr, 1, 3); // 1 이상 3 미만의 값을 stream으로 변환하라.

		stream = Stream.<Integer>builder()
					.add(1)
					.add(2)
					.add(3)
					.build(); // 객체 안에 원소를 넣고 멤버 필드를 지정한 다음에 build.

		stream = Stream.iterate(1, (i) -> i + 1).limit(3);
		
		stream = Stream.generate(() -> 1).limit(3);
		
		// stream.forEach(System.out::println);
		/**
		 * consumer type의 메소드로서 accept라는 추상 method의 body가 된다.
		 */
		
		IntStream stream2 = IntStream.range(1, 4); 
		stream2 = "abc".chars();
		//stream2.forEach(System.out::println);
		
		Stream<String> stream3 = Pattern.compile(",").splitAsStream("cat,dog,lion");
		stream3.forEach(System.out::println);
	}
}
