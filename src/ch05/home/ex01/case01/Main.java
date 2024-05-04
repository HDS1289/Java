package ch05.home.ex01.case01;
/*
 * 창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm이다.
 * 코스모스꽃은 꽃잎 길이가 4cm, 꽃받침 길이가 1cm이다.
 */
public class Main {
	public static void main(String[] args) {
		Flower flower1 = new Flower();
		
		flower1.flowerName = "창포꽃";
		flower1.petalLength = 7;
		flower1.sepalLength = 4;
		
		Flower flower2 = new Flower();
		
		flower2.flowerName = "코스모스";
		flower2.petalLength = 4;
		flower2.sepalLength = 1;
		
		System.out.printf("%s의 꽃잎 길이는 %dcm, 꽃받침 길이는 %dcm입니다.\n", flower1.flowerName, flower1.petalLength, flower1.sepalLength);
		System.out.printf("%s의 꽃잎 길이는 %dcm, 꽃받침 길이는 %dcm입니다.\n", flower2.flowerName, flower2.petalLength, flower2.sepalLength);
	}
}
