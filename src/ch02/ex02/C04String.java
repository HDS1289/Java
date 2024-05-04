package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s = "|" + " a happy ".trim() + "|"; // 스트링 내에 있는 스페이스 데이터를 제거하는 Api이다.
		s = s.concat(" dog.");
		s = s.substring(2); // 지정한 인덱스에 해당하는 문자부터 출력하는 것이다.
		System.out.println("s: " + s);
		
		s = "hello";
		System.out.printf("%s\n", s.charAt(1));
		
		int i = "apple".codePointAt(0); // n번째 인덱스에 해당하는 문자의 유니코드 값을 읽어서 할당한다.
		i = "a".hashCode(); // a의 유니코드 값을 할당한다.
		i = "A".hashCode();
		i = "O".hashCode();
		i = "b".compareTo("a"); // 유니코드 값의 차이를 구한다.
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "a".compareToIgnoreCase("A");
		i = s.indexOf("l"); // 중복 문자 중 처음 발견되는 문자의 index값을 할당한다.
		i = s.lastIndexOf("l"); // 마지막 문자의 index값을 할당한다.
		i = s.length(); // 문자열의 길이를 구한다.
		System.out.println("i: " + i);
		
		s = "develop";
		boolean b = s.startsWith("dev");
		b = s.endsWith("lop");
		b = s.endsWith("vel");
		b = s.equals("develop");
		b = s.equalsIgnoreCase("Develop"); // logical로 같은 단어인지를 확인한다.
		b = s.equals("Develop"); // physical로 비교한다. ==> 형태가 같지는 않으므로 false이다.
		b = "apple".isEmpty();
		b = "".isEmpty();
		b = s.matches("[a-zA-Z]*"); // a-zA-Z의 패턴으로 이루어졌는가?
		b = s.matches("[0-9]*"); // 0-9의 패턴으로 이루어졌는가?
		System.out.println("b: " +  b);
	}
}
