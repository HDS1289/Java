package ch05.ex05.case10;

public class Man {
	public void strip() {}
	public void wash() {}
	public void wear(Pajamas pajamas) {}
	public void lie() {}
	
	public void sleep(Pajamas pajamas) { // 잠옷을 입고 자야 한다.
		this.strip();
		this.wash();
		this.wear(pajamas);
		this.lie();
	}
}
