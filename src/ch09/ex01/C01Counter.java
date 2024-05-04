package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i  < 10; i++)
				System.out.print(i + " ");
		}); // run method를 상속과정을 거쳐서 Overriding 한 것이다.
		// datatype은 Runnable, method는 run이다.
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end.");
	}
}
