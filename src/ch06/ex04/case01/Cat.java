package ch06.ex04.case01;

public class Cat extends Animal { // 생성자를 만들지 않아도 compiler가 알아서 할당한다.
	private int age; // public Cat() {}
	
	public Cat(String catName, int age) {
		super(catName); // Animal constructor를 지칭한다.
//		this.animalName = catName;
		this.age = age;
	}
	//자식 클래스의 첫 번째 줄에는 super생성자 호출문이 있다.
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", this.getAnimalName(), this.getAge());
	}
}
