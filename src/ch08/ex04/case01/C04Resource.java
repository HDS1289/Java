package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C04Resource {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		
		try ( // resource를 선언하는 범위를 ()로 묶는다.
			PrintWriter out1 = new PrintWriter(new FileWriter("c:/DEV/1.txt"));
			PrintWriter out2 = new PrintWriter(new FileWriter("c:/DEV/2.txt"));
		) {
			for(int i = 0; i < arr.length; i++) {
				out1.println("arr[" + i + "]:" + arr[i]);
				out2.println("arr[" + i + "]:" + arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR] Array error.");
		} catch(IOException e) {
			System.out.println("ERROR] IO error.");
		}
		
		System.out.println("end.");
	}
}
// try 블럭에서 정의된 리소스는 굳이 close 명령어를 쓰지 않아도 자동으로 close가 호출된다.
// 따라서 자동으로 메모리가 청소된다.