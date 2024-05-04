package ch05.ex05.case09;

public class Cat {
	private String catName;
	
	public Cat breed() { // 클래스 내에서 같은 클래스를 다시 쓸 수 있다.
		return new Cat();
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}
}
