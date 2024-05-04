package ch04.home.ex04;

public class Once {
	public static void main(String[] args) {
		boolean b = false;
		String a = "9098";
		String c = "8";
		String d = "";
		String e = " ";
		String f = "	";
		b = a.matches("[0-9]?");
		System.out.println(b);
		b = c.matches("[0-9]?");
		System.out.println(b);
		b = d.matches("[0-9]?") && d.length() > 0;
		System.out.println(b);
		b = e.matches("[0-9]?") && e.length() > 0;
		System.out.println(b);
		b = f.matches("[0-9]?") && f.length() > 0;
		System.out.println(b);
	}
}
