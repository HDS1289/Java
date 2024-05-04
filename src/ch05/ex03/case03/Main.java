package ch05.ex03.case03;

public class Main {
	public static void main(String[] args) {
		House house1 = new House();
		House house2 = null; // class variable은 초기화 값을 null로 한다. 주소값이 없는 상태이다.
		
		house1.setAddress("서울시 강남구 역삼동");
		
		System.out.printf("%s\n%s\n\n", house1, house2);
		
		house2 = house1;
		System.out.printf("%s\n%s\n\n", house1, house2);
		System.out.printf("%s\n%s\n\n", house1.getAddress(), house2.getAddress());
	}
}
