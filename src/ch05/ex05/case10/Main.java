package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		Pajamas pajamas = new Pajamas();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.sleep(pajamas);
		man.sleep(pajamas);
	}
}
