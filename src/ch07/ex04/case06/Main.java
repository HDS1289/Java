package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat("헤롱이"); // Animal type으로 promotion이 일어났다.
		animals[1] = new Dog("왈왈이");
		animals[2] = new Dog("성큼이");
		
		for(Animal animal: animals) System.out.println(animal);
		
		Object[] objs = new Object[3]; // 모든 클래스는 Object class에 상속받는다.
		
		objs[0] = new Cat("헤롱이"); // Object type으로도 promotion이 이루어질 수 있다.
		objs[1] = new Dog("왈왈이"); // 자식의 Override된 toString() 메소드를 호출하게 된다.
		objs[2] = new Dog("성큼이");
		
		for(Object obj: objs) System.out.println(obj);
	}
}
