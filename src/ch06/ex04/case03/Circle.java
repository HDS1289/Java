package ch06.ex04.case03;

public class Circle extends Point {
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.getX(), this.getY(), r); // public으로 사용가능한 것으로 return value를 받는다.
	}
}
