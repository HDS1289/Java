package ch08.ex03.case01;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Book book1 = new Book("불편한편의점", 20000, LocalDate.of(2022, 5, 7));
		Book book2 = new Book("불편한편의점", 20000, LocalDate.of(2022, 5, 7));
		
		System.out.println(book1.hashCode());
		System.out.println(book1.toString());
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2)); // Parameter로 비교대상이 되는 Object가 들어간다.
		
		System.out.printf("%s %d %s", book1.title(), book1.price(), book1.printedDate());
	}
}
