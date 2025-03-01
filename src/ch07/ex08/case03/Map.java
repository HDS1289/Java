package ch07.ex08.case03;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map {
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User("최한석"),
				new User("한아름"),
				new User("양승일"));
		
		Set<String> userNames = users.stream()
				.map((user) -> user.getUserName())
				.collect(Collectors.toSet());
		
		userNames.forEach(System.out::println);
		System.out.println();
		
		users.stream().map(new Function<User, String>() {
			@Override
			public String apply(User user) {
				return user.getUserName();
			}
		}).collect(Collectors.toList())
		.forEach(System.out::print);
		System.out.println();
		
		users.stream().map((user) -> user.getUserName())
			.forEach(System.out::print);
		System.out.println();
		
		users.stream().map(User::getUserName) // Inner class에서의 method를 호출한 것이다.
			.forEach(System.out::print);
		System.out.println();
		
		Integer[][] arr = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		Arrays.stream(arr)
			.flatMap((inner) -> Arrays.stream(inner))
			.forEach(System.out::print);
		System.out.println();
		
	}
}

class User {
	private String userName;
	
	public User(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
}