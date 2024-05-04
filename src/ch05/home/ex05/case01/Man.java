package ch05.home.ex05.case01;

import java.time.LocalDate;

public class Man {
	// 구분할 수 있는 속성??
	private String manName;
	private int age;
	private LocalDate birthday;
	
	public void setManName(String manName) {
		this.manName = manName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public void sing() {}
	public void eat() {}
	public void run() {}
}
