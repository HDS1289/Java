package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		Chrome chrome = new Chrome();
		
		console.out();
		browser.out();
		
		UI.in(); // static method ==> 어디에 있는 일. 어느 클래스에 있는 메소드.
//		console.in();
//		browser.in();
//		Console.in();
//		Browser.in();
		
		chrome.out();
//		chrome.in();
//		Chrome.in();
		chrome.play();
		Chrome.play();

		
	}
}
