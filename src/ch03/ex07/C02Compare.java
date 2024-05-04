package ch03.ex07;

public class C02Compare {
	public static void main(String[] args) {
		boolean b = false;
		String s = "a"; // String type data의 주소값은?
		b = s == "a";
		
		s = new String("a"); // 객체의 주소값은? String type의 객체가 생성된다.
		b = s == "a";
		
		b = s.equals("a");
		System.out.println(b);
	}
}
