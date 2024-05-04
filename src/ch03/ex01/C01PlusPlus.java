package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		i++;
		System.out.println(i);
		
		++i;
		System.out.println(i);
		
		i = 0;
		int j = i++; // 먼저 참조하고 증가시켜서 할당한다.
		System.out.printf("%d, %d\n", j, i);
		
		i = 0;
		j = ++i; // 먼저 1을 증가시킨 후에 참조한다.
		System.out.printf("%d, %d\n", j, i);
	}
}
