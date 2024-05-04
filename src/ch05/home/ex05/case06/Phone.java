package ch05.home.ex05.case06;

public class Phone {
	private String phoneMaker;
	private int price;
	
	public String getPhoneMaker() {
		return phoneMaker;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPhoneMaker(String phoneMaker) {
		this.phoneMaker = phoneMaker;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void sendMessage() {}
	public void call() {}
	public void playGame() {}
}
