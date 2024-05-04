package ch05.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		
		cat1.setCatName("미덕이");
		
		Cat cat2 = cat1.breed();
		Cat cat3 = cat1.breed();
		Cat cat4 = cat1.breed();
		
		cat2.setCatName("덕일");
		cat3.setCatName("덕이");
		cat4.setCatName("덕삼");
		
		System.out.printf("%s\n%s\n%s\n%s\n", cat1, cat2, cat3, cat4);
		System.out.println();
		System.out.printf("%s\n%s\n%s\n%s\n", 
				cat1.getCatName(),
				cat2.getCatName(), 
				cat3.getCatName(), 
				cat4.getCatName());
	}
}
