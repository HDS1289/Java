package ch05.ex05.case03;
/*
 * 클래스는 데이터타입 중의 하나이다.
 */
public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1,  2); //  parameter가 10개라면???
		System.out.println(result);
		
		Paper paper = new Paper();
		paper.setA(1);
		paper.setB(2);
		
		paper = calculator.add(paper); // parameter가 paper(종이에 쓰여지기 전)이고,  return type이 paper(종이에 쓰여진 후)이다.
		System.out.println(paper.getResult());
	}
}
