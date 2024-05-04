package ch03.ex02;

public class Not { // 논리부정연산자는 !로 사용한다.
	public static void main(String[] args) {
		boolean power = false;
		
		power = !power; // 논리부정 연산자로 boolean type의 값을 전환하였다.
		//두 개의 data사이만을 오갈 수 있는 알고리즘 ==> toggle
		System.out.println(power);
		power = !power;
		System.out.println(power);
	}
}
