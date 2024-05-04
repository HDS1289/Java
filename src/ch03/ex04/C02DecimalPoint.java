package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0;
		System.out.println(shortPi);
		
		//pi값을 소수점 이하 둘째 자리까지만 출력하려면?
		shortPi = (int)(pi * 100) / 100.0;
		System.out.println(shortPi);
		
		//소수점 이하 셋째 자리까지만 출력하려면?
		shortPi = (int)(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		//소수점 이하 셋째 자리가 반올림된 형태로 출력한다?
		shortPi = Math.round(pi * 1000) / 1000.0; // Math.round()는 소수점 아래 첫째 자리에서 반올림을 한다.
		System.out.println(shortPi);
	}
}
