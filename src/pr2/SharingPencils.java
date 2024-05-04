package pr2;

public class SharingPencils {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsleft = pencils % students;
		System.out.println(pencilsleft);
	}
}
