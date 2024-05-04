package pr3;

public class Dog implements Soundable {
	private Soundable dog;
	
	@Override
	public String sound() {
		return "멍멍";
	}
}
