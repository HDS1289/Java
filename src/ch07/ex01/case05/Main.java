package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
//		Car car = new FireEngine(); // FireEngine은 자식 클래스이다.
		
//		FireEngine fireEngine = (FireEngine) new Car();
		
//		Car fireEngine = new Car();
//		
//		fireEngine.run(); // 달리는 기능은 실행할 수 있다.
////		fireEngine.water(); // 물을 뿌리는 기능은 Car type에서는 실행할 수 없다.
//		// 화재 현장에 도착하였다.
//		fireEngine = (FireEngine)fireEngine; // FireEngine type으로의 변환이 일어나서 물을 뿌리는 기능을 실행할 수 있게 된다.
//		fireEngine.water();
		Car car = new FireEngine();
		
		car.run();
//		car.water(); 물을 뿌리는 기능은 구현이 안 된다.
		
		FireEngine fireEngine = (FireEngine)car;
		
		fireEngine.water();
		fireEngine.run();
		
		((Car)fireEngine).run();
	}
}
