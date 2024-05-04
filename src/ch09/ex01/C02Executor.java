package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		};
		
		Runnable r2 = () -> {
			for(char c = 'a'; c <= 'z'; c++) {
				System.out.print(c + " ");
			}
		};
		
		Executor executor = Executors.newCachedThreadPool(); // thread가 n개 모인 집합이다.
		
		executor.execute(r1); // thread객체 하나를 생성한다.
		executor.execute(r2);
	}
}
