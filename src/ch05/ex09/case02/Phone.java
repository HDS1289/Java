package ch05.ex09.case02;

public class Phone {
	private int serial;
	private static int cnt;
	
	{
		serial = ++cnt + 100; 
	}
	
	public Phone() {}
	
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}
}
