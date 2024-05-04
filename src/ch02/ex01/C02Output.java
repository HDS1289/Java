package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		
		System.out.println(100);
		System.out.println(score);
		System.out.println(score + 1);
		
		System.out.println(Math.random());
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");
		System.out.print(400 + "\n");
		
		System.out.print("나는");
		System.out.print(" 앵무새 지구입니다.");
		System.out.println();
		
		System.out.printf("%d %s %b %c %f\n", 344, "어린이", false, 97, 0.67); // 소문자 a는 유니코드 97에 해당한다.
		System.out.printf("%d/%s/%b/%c/%f\n", 344, "어린이", false, 97, 0.67);
		
		String dogName = "페퍼";
		int age = 8;
		System.out.printf("%s는 %d살 된 보더콜리입니다.", dogName, age);
		System.out.printf("\n%s %d", dogName, age);		
		System.out.println();
		System.out.println(dogName + "는 " + age + "살 된 보더콜리입니다.");
	}
}
