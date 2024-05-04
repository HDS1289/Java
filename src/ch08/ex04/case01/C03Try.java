package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {														// 다른 종류의 메소드를 쓰기 위해서다.
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt")); // wrapping ==> 하나의 유형의 객체를 다른 유형의 객체로 둘러싸는 것이다.
			for(int i: arr) out.println("arr[" + i + "]:" + arr[i]); 
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("ERROR] Array error.");
		} catch(IOException e) {
			System.out.println("ERROR] IO error."); // 두 번째 IO exception은 실행되지 않았다.
		} finally {
			if(out != null) out.close();
		}
	}
}
