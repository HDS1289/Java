package ch08.ex04.case01;

public class C06Throws {
	public void first() {
		this.second();
	}
	/*
	public void second() {
		this.third();
	}
	*/
	
	public void second() { // try 블럭을 안 쓸 경우 error이다. (throws Exception을 사용)
		try {
			this.third();
		} catch(Exception e) {
			System.out.println("second()");
		}
	}
	
	/*
	public void third() {
		int i = 3 / 0;
	}
	*/
	
	public void third() throws Exception {
		int i = 3 / 0;
	}
	
	public static void main(String[] args) {
		new C06Throws().first();
		System.out.println("end");
	}
}
